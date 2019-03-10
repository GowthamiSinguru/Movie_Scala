class Movie(directors: Seq[Director]) {
val directorsList = directors
def directorsWithBackCatalogOfSize(numberOfFilms: Int): Seq[Director]
=
directorsList.filter(_.films.length > numberOfFilms) 
}