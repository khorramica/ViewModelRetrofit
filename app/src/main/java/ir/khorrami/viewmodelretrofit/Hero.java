package ir.khorrami.viewmodelretrofit;

public class Hero {
    private String name;

    private String realName;

    private String team;

    private String firstAppearance;

    private String createDby;

    private String publisher;

    private String imageUrl;

    private String bio;

    public Hero(String name, String realName, String team, String firstAppearance, String createDby, String publisher, String imageUrl, String bio) {
        this.name = name;
        this.realName = realName;
        this.team = team;
        this.firstAppearance = firstAppearance;
        this.createDby = createDby;
        this.publisher = publisher;
        this.imageUrl = imageUrl;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getCreateDby() {
        return createDby;
    }

    public void setCreateDby(String createDby) {
        this.createDby = createDby;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
