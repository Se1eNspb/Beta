public enum Roman2Arab {
    I(1),II(2),III(3),IV(4),V(5),
    VI(6),VII(7),VIII(8),IX(9),X(10);

    int r2a = 0;
    Roman2Arab(int r2a){
        this.r2a = r2a;
    }
    public int getR2a(){
        return r2a;
    }

}
