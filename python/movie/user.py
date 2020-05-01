from movie import Movie

class User:
    def __init__(self,name):
        self.name = name
        self.movies = []
    def __repr__(self):
        return  "<User {} films{}>" .format(self.name, self.movies)
    #def watched_movies(self):
        #Calculate a list of movies that have been watched
        #watched_movie_list = []
        #for movie in self.movie:
            #if movie.watched:
                #watched_movie_list.append(movie)
        #return watched_movie_list
    def add_movie(self,name,genre):
       movie = Movie(name, genre, False)
       self.movies.append(movie)

    def delete_movie(self, name):
        self.movies = list(filter(lambda movie: movie.name != name, self.movies))

    def watched_movies(self):
        watched_movie = list(filter(lambda x: x.watched, self.movies))
        return watched_movie
    def save_to_file(self):
        with open(self.name+".xt",'w') as f:
            f.write(self.name +"\n")
            for movie in self.movies:
                f.write(movie.name + ", " + movie.genre + ", " + str(movie.watched) + "\n")