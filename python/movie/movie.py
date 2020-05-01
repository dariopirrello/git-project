class Movie:
    def __init__(self, name, genre, wathed):
        self.name = name
        self.genre = genre
        self.watched = wathed
    def __repr__(self):
        return "<Movie {} genre {}>" .format(self.name, self.genre)
