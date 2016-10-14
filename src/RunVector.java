import java.io.IOException;

class RunVector {
	public static void main(String[] args) throws IOException {
		Vector3 vector1 = new Vector3(1F, 2F, 3F);
		Vector3 vector2 = new Vector3(0F, -1F, 0F);
		
		Vector3 vector3 = new Vector3(2F, 3F, 4F);
		Vector3 vector4 = new Vector3(5F, 6F, 7F);
		
		System.out.println("Dot Product of vectors: " + vector1.dot(vector2));
		Entity entity = new Entity(vector1, vector2);
		Ghost ghost = new Ghost(vector3, vector4);
		
		System.out.println("Ghost visible: " + ghost.isVisible(entity));
		Vector3 crossVector = vector1.cross(vector2);
		System.out.println("cross product: " + crossVector.x + "," + crossVector.y + "," + crossVector.z);
		System.out.println("dot product of cross: " + vector1.dot(vector1.cross(vector2)));
	}
}