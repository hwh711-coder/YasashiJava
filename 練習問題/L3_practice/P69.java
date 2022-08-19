import java.io.*;

class Sample_P1{
    public static void main(String[] args) throws IOException{
        System.out.println("あなたは何歳ですか?");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        // str -> int
        int Age = Integer.parseInt(str);

        System.out.println("あなたは" + Age + "歳です。");
    }
}

class Sample_P2{
    public static void main(String[] args) throws Exception{
        System.out.println("円周率の値はいくつですか？");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        float pi = Float.parseFloat(str);

        System.out.println("円周率の値は" + pi + "です。");
    }
}

class Sample_P3{
    public static void main(String[] args) throws Exception{
        System.out.println("身長と体重を入力してください。");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        float Height = Float.parseFloat(str1);
        float Weight = Float.parseFloat(str2);

        System.out.println("身長は" + Height + "センチです。");
        System.out.println("体重は" + Weight + "キロです。");

    }
}