import java.awt.Color;
public class StartD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Novel write = new Novel("book");
		write.setCharacter("Jeff");
		
		write.setWriting("Jeff was the only person left alive on earth. The end.");
		write.setStatus(Status.editing);
		
		write.Extra(" Also, he had chips with him, and he ate them.");
		
		write.setStatus(Status.published);
		System.out.println(write.toString());
		
		Poem poem = new Poem("Beauty", "aabb");
		
		poem.setWriting("What a bird, it's the word, what a sky, it's a lie.");
		poem.setStatus(Status.editing);
		poem.Extra(" Also, the bird had chips and it was very happy.");
		poem.setStatus(Status.published);
		System.out.println(poem.toString());
		
		
		
		//Subclasses
		Color blue = Color.blue;
		
		
		Polygon shape = new Polygon(blue, 3);
		
		shape.setCorners(0, 5, 7);
		shape.setCorners(1, 10, 10);
		shape.setCorners(2, 5, 10);
		System.out.println(shape.toString());
		shape.move(10, 10);
		System.out.println(shape.toString());
		
		System.out.println("");
		Rectangle rec = new Rectangle(0,0,10, 20, blue);
		
		rec.Draw();
		System.out.println(rec.toString());
		
		rec.move(10, 20);
		System.out.println(rec.toString());
		System.out.println("");
		Triangle tri = new Triangle(0,0, 30, 50, blue);
		tri.Draw();
		System.out.println(tri.toString());
		
		tri.move(20, 15);
		System.out.println(tri.toString());
		System.out.println("");
		
		Squarelab6 sq = new Squarelab6(0,0,200,blue);
		
		sq.Draw();
		System.out.println(sq.toString());
		sq.move(45, 3000);
		
		System.out.println(sq.toString());
		
		
		
		
		
		
	}

}
