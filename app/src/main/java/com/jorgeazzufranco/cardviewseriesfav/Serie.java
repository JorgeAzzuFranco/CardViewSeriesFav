package com.jorgeazzufranco.cardviewseriesfav;

/**
 * Created by uca on 04-24-18.
 */

public class Serie {

        private String name;
        private String caps;
        private int img;
        private String desc;
        private boolean fav;

        public Serie(String name, String caps, int img, String desc) {
            this.name = name;
            this.caps = caps;
            this.img = img;
            this.desc = desc;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCaps() {
            return caps;
        }

        public void setCaps(String caps) {
            this.caps = caps;
        }

        public int getImg() {
            return img;
        }

        public void setImg(int img) {
            this.img = img;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }
}
