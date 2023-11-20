package variables;

public class СценарийИРоли {
    public static void main(String[] args) {
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        String[][] g = new String[roles.length][textLines.length+1];
        for (int i=0;i<roles.length;i++ ) {
            g[i][0] = roles[i] + ":";
        }
        for(int i=0;i<textLines.length;i++){
            for(int j=0;j<roles.length;j++){
                if(textLines[i].startsWith(g[j][0])){
                    g[j][i+1]=(i+1) + ") " + textLines[i].replaceFirst(g[j][0]+" ", "");
                    break;
                }
            }
        }
        StringBuilder result=new StringBuilder("");
        for(int i=0;i<roles.length;i++){
            for (int j = 0;j<textLines.length+1;j++){
                if (g[i][j]!=null)
                    result.append(g[i][j] + '\n');
            }
            result.append('\n');
        }
        System.out.println(result.toString());
    }
}
