package sidespell.tech.viewholderquiz;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by raprap on 1/14/2016.
 */
public class Movie {

    private String movieName;
    private String movieGenre;
    private String movieDesc;
    private int imgId;

    public Movie(String movieName, String movieGenre, String movieDesc, int imgId) {
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.movieDesc = movieDesc;
        this.imgId = imgId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

}
