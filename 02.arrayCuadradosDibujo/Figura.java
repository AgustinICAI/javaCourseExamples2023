import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura
{
	int x;
	int y;
	boolean relleno;
  Color color;
  
	/** 
		Inicializa todos los atributos del objeto 
		@param x Posición x de la ventana en pixels
		@param y Posición x de la ventana en pixels
		@param lado Tamaño del cuadrado en pixels
	*/
	Figura(int x, int y, boolean relleno, Color color)
	{
		this.setX(x);
		this.setY(y);
		this.setLado(lado);
	}

	int getX()
	{
		return x;
	}

	int getY()
	{
		return y;
	}

	int getLado()
	{
		return lado;
	}

	void setX(int x)
	{
		if(x>0 && x<800)
			this.x = x;
	}

	void setY(int y)
	{
		if(y>0 && y<600)
			this.y = y;
	}
	Color getColor(){
	  return this.color;
	}
  
  void pintar (Graphics g){
    g.setColor(getColor());
  }
  
}
