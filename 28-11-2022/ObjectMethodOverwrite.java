public class ObjectMethodOverwrite extends Object{
    public String variable1 ;
    public String variable2 ;
    public ObjectMethodOverwrite(String variable1, String variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }
    public String getVariable1() {
        return this.variable1;
    }
    public String getVariable2() {
        return this.variable2;
    }
    
    public  String toString() { 
        return this.variable1 + this.variable2;
    }
    public boolean equals(ObjectMethodOverwrite obj) {
        if(this.getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        if(this.variable1 == obj.variable1) return true;
        return false;
    }
    
}