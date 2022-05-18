public class Horse{
    private final Integer weigth;
    private final Integer height;

    public Horse(Integer weigth, Integer height){
        this.height = weigth;
        this.weigth = height;
    }
    public Integer getWeigth(){
        return weigth;
    }

    public Integer getHeight(){
        return height;
    }

    public Integer sise() {
        return (weigth+height)/2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Horse other = (Horse) obj;
        if (weigth != other.weigth)
            return false;
        if (height == null) {
            if (other.height != null)
                return false;
        } else if (!height.equals(other.height))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weigth=" + weigth +
                ", height=" + height +
                '}';
    }
}
