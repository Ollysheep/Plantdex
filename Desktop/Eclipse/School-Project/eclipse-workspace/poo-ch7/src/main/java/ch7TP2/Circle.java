package ch7TP2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Circle extends Shape implements Calculable{
	
    private float rayon;

    @Override
    public float area() {
        return (float) (Math.PI * rayon * rayon);
    }

    @Override
    public float perimeter() {
        return (float) (2 * Math.PI * rayon);
    }

}
