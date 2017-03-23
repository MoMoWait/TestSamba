import jcifs.smb.SmbFile;
public class TestSmb {
	public static void main(String[] args) throws Exception{
/*		SmbFile smbFile = new SmbFile("smb://10.10.10.163/", new NtlmPasswordAuthentication("", "gf", "gf6548914"));
*/		SmbFile smbFile = new SmbFile("smb://10.10.10.163/gf");
		try{
			SmbFile[] hostFiles = smbFile.listFiles();

			for(SmbFile itemHostFile : hostFiles){
				//String server = itemHostFile.getServer();
				//System.out.println(server);
				System.out.println(itemHostFile.toString());
				System.out.println();
			}
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}
}
