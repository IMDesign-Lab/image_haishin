//==============================================
//パッケージの読み込み
import java.text.*;
import java.io.*;
public class SetHostname{
 	//==============================================
	//ファイルに文字列を書き出す
	public void writeln(BufferedOutputStream m_file,String str)
	{
		try{
			m_file.write((str+"\n").getBytes());
			m_file.write('\r');
			m_file.write('\n');
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

	public void run(String hostname)
	{
		BufferedOutputStream file;
		String filename=hostname+".bat";
		String str;
		try{
			file = new BufferedOutputStream(new FileOutputStream(filename));
			str = "wmic ComputerSystem WHERE \"name='%computername%'\" Call Rename \""+hostname+"\"";
			writeln(file,str);
			str = "shutdown /r /t 0";
			writeln(file,str);
			file.close();
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

    //==============================================
    //メイン
	public static void main(String[] args) {
		SetHostname obj=new SetHostname();

		obj.run("305-01");
		obj.run("305-02");
		obj.run("410-00");
		obj.run("410-10");
		obj.run("410-11");
		obj.run("410-12");
		obj.run("410-13");
		obj.run("410-14");
		obj.run("410-15");
		obj.run("410-16");
		obj.run("410-17");
		obj.run("410-20");
		obj.run("410-21");
		obj.run("410-22");
		obj.run("410-23");
		obj.run("410-24");
		obj.run("410-25");
		obj.run("410-26");
		obj.run("410-27");
		obj.run("410-30");
		obj.run("410-31");
		obj.run("410-32");
		obj.run("410-33");
		obj.run("410-34");
		obj.run("410-35");
		obj.run("410-36");
		obj.run("410-37");
		obj.run("410-40");
		obj.run("410-41");
		obj.run("410-42");
		obj.run("410-43");
		obj.run("410-44");
		obj.run("410-45");
		obj.run("410-46");
		obj.run("410-47");
		obj.run("410-48");
		obj.run("410-49");
		obj.run("410-50");
		obj.run("410-51");
		obj.run("410-52");
		obj.run("410-53");
		obj.run("410-54");
		obj.run("410-55");
		obj.run("410-56");
		obj.run("410-57");
		obj.run("410-58");
		obj.run("410-59");
		obj.run("410-60");
		obj.run("410-61");
		obj.run("410-62");
		obj.run("410-63");
		obj.run("410-64");
		obj.run("410-65");
		obj.run("410-66");
		obj.run("410-67");
		obj.run("410-68");
		obj.run("410-69");
		obj.run("410-70");
		obj.run("410-71");
		obj.run("410-72");
		obj.run("410-73");
		obj.run("410-74");
		obj.run("410-75");
		obj.run("410-76");
		obj.run("410-77");
		obj.run("411-01");
		obj.run("411-02");
		obj.run("411-03");
		obj.run("411-04");
		obj.run("411-05");
		obj.run("411-06");
		obj.run("415-11");
		obj.run("415-12");
		obj.run("415-21");
		obj.run("415-22");
		obj.run("415-23");
		obj.run("415-24");
		obj.run("415-31");
		obj.run("415-32");
		obj.run("415-33");
		obj.run("415-34");
		obj.run("415-41");
		obj.run("415-42");
		obj.run("415-43");
		obj.run("415-44");
		obj.run("415-51");
		obj.run("415-52");
		obj.run("415-53");
		obj.run("415-54");
		obj.run("415-61");
		obj.run("415-62");
		obj.run("415-63");
		obj.run("415-64");
	}
}
