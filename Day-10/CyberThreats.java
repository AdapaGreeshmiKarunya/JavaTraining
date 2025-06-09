package india.cyber;
public class CyberThreats{
    public static void main(String[] args) {
        CyberThreats cyber = new CyberThreats();
        cyber.phishing();
        cyber.ransomware();
        cyber.malware();
        cyber.ddosAttack();
        cyber.socialEngineering();
        cyber.insiderThreat();
        cyber.sqlInjection();
        cyber.crossSiteScripting();
        cyber.manInTheMiddle();
        cyber.credentialStuffing();
        cyber.bruteForceAttack();
        
    }
    public void phishing() {
        System.out.println("Phishing attack detected!");
    }
    public void ransomware() {
        System.out.println("Ransomware attack detected!");
    }
    public void malware() {
        System.out.println("Malware attack detected!");
    }
    public void ddosAttack() {
        System.out.println("DDoS attack detected!");
    }
    public void socialEngineering() {
        System.out.println("Social engineering attack detected!");
    }
    public void insiderThreat() {
        System.out.println("Insider threat detected!");
    }
    public void sqlInjection() {
        System.out.println("SQL injection attack detected!");
    }
    public void crossSiteScripting() {
        System.out.println("Cross-site scripting attack detected!");
    }
    public void manInTheMiddle() {
        System.out.println("Man-in-the-middle attack detected!");
    }
    public void credentialStuffing() {
        System.out.println("Credential stuffing attack detected!");
    }
    public void bruteForceAttack() {
        System.out.println("Brute force attack detected!");
    }
    private void dataBreach() {
        System.out.println("Data breach detected!");
    }
    protected void botnet() {
        System.out.println("Botnet attack detected!");
    }
    protected void cryptojacking() {
        System.out.println("Cryptojacking attack detected!");
    }
    void sessionHijacking() {
        System.out.println("Session hijacking attack detected!");
    }
}