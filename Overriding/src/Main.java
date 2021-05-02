
public class Main {

	public static void main(String[] args) {
		
		BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]
		{new OgrenciKrediManager(),new TarimKrediManager(),new OgretmenKrediManager()};
		
		for (BaseKrediManager baseKrediManager : baseKrediManagers) {
			 System.out.println(baseKrediManager.krediHesapla(1000));
		}
	}

}
