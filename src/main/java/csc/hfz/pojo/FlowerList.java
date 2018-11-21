package csc.hfz.pojo;

import java.util.Date;

public class FlowerList {
    private Integer flowerid;

    private String flowername;

    private String flowerlanguage;

    private Double flowerprice;

    private String image;

    private Integer number;

    private Integer cid;

    private String status;

    private Date created;

    private Date updated;

    public Integer getFlowerid() {
        return flowerid;
    }

    public void setFlowerid(Integer flowerid) {
        this.flowerid = flowerid;
    }

    public String getFlowername() {
        return flowername;
    }

    public void setFlowername(String flowername) {
        this.flowername = flowername == null ? null : flowername.trim();
    }

    public String getFlowerlanguage() {
        return flowerlanguage;
    }

    public void setFlowerlanguage(String flowerlanguage) {
        this.flowerlanguage = flowerlanguage == null ? null : flowerlanguage.trim();
    }

    public Double getFlowerprice() {
        return flowerprice;
    }

    public void setFlowerprice(Double flowerprice) {
        this.flowerprice = flowerprice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}