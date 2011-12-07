class SpongeBob extends Hewan implements Manusia
{
	public SpongeBob()
	{
		super("sponge bob",2,false);
	}
	
	public void bersuara()
	{
		System.out.println("\n Hello Patrick...");
	}
	
	public void menyanyi()
	{
		System.out.println("La..la..la..la..la....");
	}
	
	public void ketawa()
	{
		System.out.println("ha..ha..ha.....");
	}
	
	public static void makan()
	{
		System.out.println("Hmm... yummy... :q");
	}
	
	public void makan2()
	{
		super.makan();
	}
	
	public static void main(String[] args)
	{
		SpongeBob s = new SpongeBob();
		s.isHewan();
		s.bersuara();
		s.menyanyi();
		s.ketawa();
		s.makan2();
		Hewan.makan();
		makan();
	}
}