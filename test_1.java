import java.io.FileOutputStream;
class FileHandling
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fout= new FileOutputStream("demo.txt");
			byte a[] = {65,66,67,68,69,70,71};
			fout.write(a);
			fout.write(75);
			fout.write(a,2,5);
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}