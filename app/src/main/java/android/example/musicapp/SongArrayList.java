package android.example.musicapp;

public class SongArrayList {
    private int mImageId;
    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

    public SongArrayList(int mImageId, String mSongName, String mArtistName, String mAlbumName) {
        this.mImageId = mImageId;
        this.mSongName = mSongName;
        this.mArtistName = mArtistName;
        this.mAlbumName = mAlbumName;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    String getSongName() {
        return mSongName;
    }

    public void setmSongName(String mSongName) {
        this.mSongName = mSongName;
    }

    String getArtistName() {
        return mArtistName;
    }

    public void setmArtistName(String mArtistName) {
        this.mArtistName = mArtistName;
    }

    String getAlbumName() {
        return mAlbumName;
    }

}
