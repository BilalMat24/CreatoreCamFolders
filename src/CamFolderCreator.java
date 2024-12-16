import java.io.File;

public class CamFolderCreator {
    private static final String BASE_PATH = "C:\\Users\\bilal.biaz\\ProgettoVIT\\ControlloImmagini\\nuovaImmagini\\2024\\12\\03";
    private static final String[] CAMS = {
            "cam2","cam03", "cam4", "cam5", "cam6", "cam8", "cam10", "cam11", "cam30", "cam31", "cam32",
            "cam34", "cam35", "cam37", "cam39", "cam40", "cam41", "cam42", "cam43", "cam44", "cam45",
            "cam46", "cam47", "cam48", "cam49", "cam50", "cam51", "cam52", "cam53", "cam54", "cam55",
            "cam56", "cam60", "cam61", "cam62", "cam63", "cam64", "cam65", "cam66", "cam67", "cam68",
            "cam69", "cam70", "cam71", "cam72", "cam73", "cam74", "cam75", "cam76", "cam77", "cam78",
            "cam79", "cam80", "cam81", "cam82", "cam83", "cam84", "cam85", "cam86", "cam87", "cam88",
            "cam89", "cam90", "cam91", "cam92", "cam93", "cam94", "cam95", "cam96", "cam97", "cam98",
            "cam99", "cam100", "cam101", "cam102", "cam103", "cam104", "cam105", "cam106", "cam107",
            "cam108", "cam109", "cam110", "cam111", "cam112", "cam113", "cam114", "cam115", "cam116",
            "cam117", "cam118", "cam119", "cam120", "cam121", "cam122", "cam123", "cam124", "cam125",
            "cam126", "cam127", "cam128", "cam129", "cam130","cam131", "cam132", "cam133", "cam134",
            "cam135"
    };

    public static void main(String[] args) {
        File baseDir = new File(BASE_PATH);

        if (!baseDir.exists()) {
            System.out.println("La directory di base specificata non esiste: " + BASE_PATH);
            return;
        }

        for (String cam : CAMS) {
            File camDir = new File(baseDir, cam);
            if (!camDir.exists()) {
                if (camDir.mkdirs()) {
                    System.out.println("Creata cartella: " + camDir.getAbsolutePath());
                } else {
                    System.out.println("Errore nella creazione della cartella: " + camDir.getAbsolutePath());
                }
            } else {
                System.out.println("La cartella esiste già: " + camDir.getAbsolutePath());
            }
        }
    }
}
