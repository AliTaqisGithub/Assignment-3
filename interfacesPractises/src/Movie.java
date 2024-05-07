public class Movie {
    public String title;
    public String director;
    public int releasedyear;
    public int rating;

    public Movie(String title, String director, int releasedyear, int rating) {
        this.title = title;
        this.director = director;
        this.releasedyear = releasedyear;
        this.rating = rating;
    }

    public Movie() {
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getReleasedyear() {
        return releasedyear;
    }
    public void setReleasedyear(int releasedyear) {
        this.releasedyear = releasedyear;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return String.format("\nMovie" + "title=" + title + '\n' + ", director='" + director + '\n' + ", releasedyear=" + releasedyear + ", rating=" + rating);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

