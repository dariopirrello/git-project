from user import User
from movie import Movie

user = User("Dario")
my_movie1 = Movie("Matrix","Sci-Fi",False)
my_movie2 = Movie("Jiumangi","Sci-Fi",True)
user.movies.append(my_movie1)
user.movies.append(my_movie2)
user.save_to_file()
print(user.watched_movies())