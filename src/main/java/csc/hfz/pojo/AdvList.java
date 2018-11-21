package csc.hfz.pojo;

import java.util.Date;

public class AdvList {
    private Long advid;

    private String image;

    private Date created;

    private Date updated;

    public Long getAdvid() {
        return advid;
    }

    public void setAdvid(Long advid) {
        this.advid = advid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdate() {
        return updated;
    }

    public void setUpdate(Date updated) {
        this.updated = updated;
    }
}