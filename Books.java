public class Books {
        private String title;
        private int numberofpages;
        private int publicationyear;

        public Books(String title, int numberofpages, int publicationyear) {
            this.title = title;
            this.numberofpages = numberofpages;
            this.publicationyear = publicationyear;
        }
        public String getTitle() {
            return title;
        }
    
        public int getNumberofpages() {
            return numberofpages;
        }

        public int getPublicationyear() {
            return publicationyear;
        }
    
        public String toString(){
            return getTitle() + "," + getNumberofpages() + "," + getPublicationyear();

       }
    }



