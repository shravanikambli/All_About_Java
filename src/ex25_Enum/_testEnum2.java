package ex25_Enum;

public class _testEnum2 {
    public static void main(String[] args) {
        ENV env = ENV.STAGING;
        System.out.println(env.getBaseURL());
        System.out.println(ENV.PROD.getBaseURL());
        System.out.println(ENV.DEV.getBaseURL());

    }}
    enum ENV {
        DEV("https://dev.myapp.com"),
        STAGING("https://staging.myapp.com"),
        PROD("https://myapp.com");
        private final String baseURL;
        ENV(String baseURL){
            this.baseURL=baseURL;
        }
        public String getBaseURL(){
            return baseURL;
        }
    }