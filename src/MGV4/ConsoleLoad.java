package MGV4;

public class ConsoleLoad {
    private String lastLine = "";
    private byte anim;
    public void print(String line) {
        //clear the last line if longer
        if (lastLine.length() > line.length()) {
            String temp = "";
            for (int i = 0; i < lastLine.length(); i++) {
                temp += " ";
            }
            if (temp.length() > 1)
                System.out.print("\r" + temp);
        }
        System.out.print("\r" + line);
        lastLine = line;
    }

    public void animate(String line, String loadText) {
        switch (anim) {
            case 1:
                print("[   |||    ]");
                break;
            case 2:
                print("[  ||||||  ]");
                break;
            case 3:
                print("[ |||||||| ]");
                break;
            case 4:
                print("[ " + loadText +"! ] ");
                break;

            default:
                print("[    |     ]");
                anim = 0;


        }
        anim++;
    }
}
