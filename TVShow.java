public class TVShow {
        private String name;
        private int episodes;
        private String genre;

        public TVShow(String episodeName, int numberOfepisodes, String genre) {
            this.name = episodeName;
            this.episodes = numberOfepisodes;
            this.genre = genre;
        }
        public String getEpisodeName() {
            return name;
        }
    
        public int getNumberOfepisodes() {
            return episodes;
        }

        public String getGenre() {
            return genre;
        }
    
        public String toString(){
            return "The name of the show is " + getEpisodeName() + " with " + getNumberOfepisodes() + " number of episodes. The genre is " + getGenre();

       }
    }

