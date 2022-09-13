public class Circle {
  
  Circle(float radius){
    this.radius = radius;
  }

  public float radius;
  //public float pi = 3.14F;
  
  public double area(){
    /* pi.r^2*/
    double area = Math.PI*(this.radius*this.radius); //Math.pow(this.radius, 2)
    return area;
  }
  public double circumference(){
    /* 2.pi.r*/
    double circumference = 2*Math.PI*this.radius;
    return circumference;
  }
}
