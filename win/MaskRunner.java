class MaskRunner
{
	public static void main(String[] args)
	{
		System.out.println("starts MaskRunner");
		Mask mask=new Mask();
		Mask mask1=new Mask(450);
		System.out.println("cost:"+mask1.cost);
		Mask mask2=new Mask('M');
		System.out.println("size:"+mask2.size);
		Mask mask3=new Mask("cotton");
		System.out.println("material:"+mask3.material);
		Mask mask4=new Mask(350,'S',"nylon");
		System.out.println("cost:"+mask4.cost);
		System.out.println("size:"+mask4.size);
		System.out.println("size:"+mask4.material);
		System.out.println("material:"+mask4.cost);
		Mask mask5=new Mask(500,'M');
		System.out.println("cost:"+mask5.cost);
		System.out.println("size:"+mask5.size);
		
	}
}