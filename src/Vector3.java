class Vector3
{
  float x;
  float y;
  float z;

  public Vector3(float x, float y, float z) 
  { 
    this.x = x; 
    this.y = y; 
    this.z = z; 
  } 

  public float magnitude()
  {
    return (float) Math.sqrt(x * x + y * y + z * z);
  }

  //returns the dot product of this and that
  public float dot(Vector3 that)
  {
     return this.x * that.x + this.y * that.y + this.z * that.z;
  }
 

  //returns the cross product of this and that
  public Vector3 cross(Vector3 that) {
	  
	  return new Vector3(this.y * that.z - this.z * that.y, //Cx = AyBz - AzBy
			  this.z * that.x - this.x * that.z, 			//Cy = AzBx - AxBz
			  this.x * that.y - this.y * that.x);			//Cz = AxBy - AyBx
  }
}

class Entity
{
  Vector3 position;
  Vector3 facing;  

  public Entity(Vector3 position, Vector3 facing) 
  { 
    this.position = position; 
    this.facing = facing; 
  } 

  public boolean isVisible(Entity player)
  {
    return true;
  }
}

class Ghost extends Entity{
	
	public Ghost(Vector3 position, Vector3 facing) { 
		super(position, facing);
	}
	
	@Override
	public boolean isVisible(Entity player) {
		return this.position.dot(player.facing) > 0;
	}
}