package jtklimko.imageswiper;

public class cards {
    private String userId;
    private String name;
    private int mDrawable;
    public cards(int mDrawable){
        //String userId, String name
        //set private string uid/name = paramater uid/name
        this.userId = userId;
        this.name = name;
        this.mDrawable = mDrawable;
    }

    public String getUserId() {
        return userId;
    }
    public void  setUserId(String userId){
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }
    public int getmDrawable(){
        return mDrawable;
    }
    public void setmDrawable(int mDrawable){

        this.mDrawable = mDrawable;
    }
}
