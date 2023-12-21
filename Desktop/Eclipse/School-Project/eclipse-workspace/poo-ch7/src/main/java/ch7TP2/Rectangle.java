package ch7TP2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Rectangle extends Shape implements Calculable{
	
    private float lenght;
    private float width;
    
    @Override
    public float area() {
        return (float) (lenght * width);
    }

    @Override
    public float perimeter() {
        return (float) ((lenght + width) * 2);
    }

}
