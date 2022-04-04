package Ventanas;

import Rule.*;

public class Sistema_Experto {
    
    BooleanRuleBase basedereglas = new BooleanRuleBase("basedereglas");
    
    
    //Creando las variables
    RuleVariable Nota1;
    RuleVariable Nota2;
    RuleVariable Nota3; 
    
    RuleVariable ResultadoAcorde;

    
    String resultado="";
    
    //Metodo para verificar acorde
    public String Acorde(String nota1, String nota2, String nota3){
        basedeconocimiento();//llamando a la base de conocimiento
             
        Nota1.setValue(nota1);//Asignando valores a las variables por paso de parametros
        Nota2.setValue(nota2);
        Nota3.setValue(nota3);
        basedereglas.forwardChain();//llamando el encamintamiento hacia adelante
        resultado=ResultadoAcorde.getValue();
        return resultado;
    }
    
    
    
    public void basedeconocimiento(){
    //Instanciando las variables    
    Nota1 = new RuleVariable(basedereglas,"");
    Nota2 = new RuleVariable(basedereglas,"");
    Nota3 = new RuleVariable(basedereglas,"");
    
    ResultadoAcorde = new RuleVariable(basedereglas,"");      
    
    
    Condition igual = new Condition("=");
    
    
    //Acorde Do Mayor combinación 1
    Rule DO_M_1 = new Rule(basedereglas,"DO_M_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Do"),
        new Clause(Nota2,igual,"Mi"),
    new Clause(Nota3,igual,"Sol")},
       new Clause(ResultadoAcorde,igual,"Do Mayor")
    ); 
    
    //Acorde Do Mayor combinación 2
    Rule DO_M_2 = new Rule(basedereglas,"DO_M_2",
    new Clause[]{
    new Clause(Nota1,igual,"Do"),
        new Clause(Nota2,igual,"Sol"),
    new Clause(Nota3,igual,"Mi")},
       new Clause(ResultadoAcorde,igual,"Do Mayor")
    ); 
    
    //Acorde Do Mayor combinación 3
    Rule DO_M_3 = new Rule(basedereglas,"DO_M_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Mi"),
        new Clause(Nota2,igual,"Do"),
    new Clause(Nota3,igual,"Sol")},
       new Clause(ResultadoAcorde,igual,"Do Mayor")
    ); 
    
    //Acorde Do Mayor combinación 4
    Rule DO_M_4 = new Rule(basedereglas,"DO_M_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Mi"),
        new Clause(Nota2,igual,"Sol"),
    new Clause(Nota3,igual,"Do")},
       new Clause(ResultadoAcorde,igual,"Do Mayor")
    ); 
    
    //Acorde Do Mayor combinación 5
    Rule DO_M_5 = new Rule(basedereglas,"DO_M_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol"),
        new Clause(Nota2,igual,"Do"),
    new Clause(Nota3,igual,"Mi")},
       new Clause(ResultadoAcorde,igual,"Do Mayor")
    ); 
    
    //Acorde Do Mayor combinación 6
    Rule DO_M_6 = new Rule(basedereglas,"DO_M_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol"),
        new Clause(Nota2,igual,"Mi"),
    new Clause(Nota3,igual,"Do")},
       new Clause(ResultadoAcorde,igual,"Do Mayor")
    ); 
    
    //Acorde Do Menor combinación 1
    Rule DO_m_1 = new Rule(basedereglas,"DO_m_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Do"),
        new Clause(Nota2,igual,"Re#"),
    new Clause(Nota3,igual,"Sol")},
       new Clause(ResultadoAcorde,igual,"Do Menor")
    ); 
    
    //Acorde Do Menor combinación 2
    Rule DO_m_2 = new Rule(basedereglas,"DO_m_2",
    new Clause[]{
    new Clause(Nota1,igual,"Do"),
        new Clause(Nota2,igual,"Sol"),
    new Clause(Nota3,igual,"Re#")},
       new Clause(ResultadoAcorde,igual,"Do Menor")
    ); 
    
    //Acorde Do Menor combinación 3
    Rule DO_m_3 = new Rule(basedereglas,"DO_m_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re#"),
        new Clause(Nota2,igual,"Do"),
    new Clause(Nota3,igual,"Sol")},
       new Clause(ResultadoAcorde,igual,"Do Menor")
    ); 
    
    //Acorde Do Menor combinación 4
    Rule DO_m_4 = new Rule(basedereglas,"DO_m_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re#"),
        new Clause(Nota2,igual,"Sol"),
    new Clause(Nota3,igual,"Do")},
       new Clause(ResultadoAcorde,igual,"Do Menor")
    ); 
    
    //Acorde Do Menor combinación 5
    Rule DO_m_5 = new Rule(basedereglas,"DO_m_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol"),
        new Clause(Nota2,igual,"Do"),
    new Clause(Nota3,igual,"Re#")},
       new Clause(ResultadoAcorde,igual,"Do Menor")
    ); 
    
    //Acorde Do Menor combinación 6
    Rule DO_m_6 = new Rule(basedereglas,"DO_m_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol"),
        new Clause(Nota2,igual,"Re#"),
    new Clause(Nota3,igual,"Do")},
       new Clause(ResultadoAcorde,igual,"Do Menor")
    ); 
    
    
    //Acorde Re Mayor combinación 1
    Rule RE_M_1 = new Rule(basedereglas,"RE_M_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re"),
        new Clause(Nota2,igual,"Fa#"),
    new Clause(Nota3,igual,"La")},
       new Clause(ResultadoAcorde,igual,"Re Mayor")
    );

    //Acorde Re Mayor combinación 2
    Rule RE_M_2 = new Rule(basedereglas,"RE_M_2",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re"),
        new Clause(Nota2,igual,"La"),
    new Clause(Nota3,igual,"Fa#")},
       new Clause(ResultadoAcorde,igual,"Re Mayor")
    );
    
    //Acorde Re Mayor combinación 3
    Rule RE_M_3 = new Rule(basedereglas,"RE_M_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Fa#"),
        new Clause(Nota2,igual,"Re"),
    new Clause(Nota3,igual,"La")},
       new Clause(ResultadoAcorde,igual,"Re Mayor")
    );
    
    //Acorde Re Mayor combinación 4
    Rule RE_M_4 = new Rule(basedereglas,"RE_M_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Fa#"),
        new Clause(Nota2,igual,"La"),
    new Clause(Nota3,igual,"Re")},
       new Clause(ResultadoAcorde,igual,"Re Mayor")
    );
    
    //Acorde Re Mayor combinación 5
    Rule RE_M_5 = new Rule(basedereglas,"RE_M_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"La"),
        new Clause(Nota2,igual,"Re"),
    new Clause(Nota3,igual,"Fa#")},
       new Clause(ResultadoAcorde,igual,"Re Mayor")
    );
    
    //Acorde Re Mayor combinación 6
    Rule RE_M_6 = new Rule(basedereglas,"RE_M_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"La"),
        new Clause(Nota2,igual,"Fa#"),
    new Clause(Nota3,igual,"Re")},
       new Clause(ResultadoAcorde,igual,"Re Mayor")
    );
    
    
    //Acorde Re Menor combinación 1
    Rule RE_m_1 = new Rule(basedereglas,"RE_m_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re"),
        new Clause(Nota2,igual,"Fa"),
    new Clause(Nota3,igual,"La")},
       new Clause(ResultadoAcorde,igual,"Re Menor")
    );

    //Acorde Re Menor combinación 2
    Rule RE_m_2 = new Rule(basedereglas,"RE_m_2",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re"),
        new Clause(Nota2,igual,"La"),
    new Clause(Nota3,igual,"Fa")},
       new Clause(ResultadoAcorde,igual,"Re Menor")
    );
    
    //Acorde Re Menor combinación 3
    Rule RE_m_3 = new Rule(basedereglas,"RE_m_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Fa"),
        new Clause(Nota2,igual,"Re"),
    new Clause(Nota3,igual,"La")},
       new Clause(ResultadoAcorde,igual,"Re Menor")
    );
    
    //Acorde Re Menor combinación 4
    Rule RE_m_4 = new Rule(basedereglas,"RE_m_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Fa"),
        new Clause(Nota2,igual,"La"),
    new Clause(Nota3,igual,"Re")},
       new Clause(ResultadoAcorde,igual,"Re Menor")
    );
    
    //Acorde Re Menor combinación 5
    Rule RE_m_5 = new Rule(basedereglas,"RE_m_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"La"),
        new Clause(Nota2,igual,"Re"),
    new Clause(Nota3,igual,"Fa")},
       new Clause(ResultadoAcorde,igual,"Re Menor")
    );
    
    //Acorde Re Menor combinación 6
    Rule RE_m_6 = new Rule(basedereglas,"RE_m_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"La"),
        new Clause(Nota2,igual,"Fa"),
    new Clause(Nota3,igual,"Re")},
       new Clause(ResultadoAcorde,igual,"Re Menor")
    );
    
    
    //Acorde Mi Mayor combinación 1
    Rule MI_M_1 = new Rule(basedereglas,"MI_M_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Mi"),
        new Clause(Nota2,igual,"Sol#"),
    new Clause(Nota3,igual,"Si")},
       new Clause(ResultadoAcorde,igual,"Mi Mayor")
    ); 
    
    //Acorde Mi Mayor combinación 2
    Rule MI_M_2 = new Rule(basedereglas,"MI_M_2",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Mi"),
        new Clause(Nota2,igual,"Si"),
    new Clause(Nota3,igual,"Sol#")},
       new Clause(ResultadoAcorde,igual,"Mi Mayor")
    ); 
    
    //Acorde Mi Mayor combinación 3
    Rule MI_M_3 = new Rule(basedereglas,"MI_M_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol#"),
        new Clause(Nota2,igual,"Mi"),
    new Clause(Nota3,igual,"Si")},
       new Clause(ResultadoAcorde,igual,"Mi Mayor")
    ); 
    
    //Acorde Mi Mayor combinación 4
    Rule MI_M_4 = new Rule(basedereglas,"MI_M_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol#"),
        new Clause(Nota2,igual,"Si"),
    new Clause(Nota3,igual,"Mi")},
       new Clause(ResultadoAcorde,igual,"Mi Mayor")
    ); 
    
    //Acorde Mi Mayor combinación 5
    Rule MI_M_5 = new Rule(basedereglas,"MI_M_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Si"),
        new Clause(Nota2,igual,"Mi"),
    new Clause(Nota3,igual,"Sol#")},
       new Clause(ResultadoAcorde,igual,"Mi Mayor")
    ); 
    
    //Acorde Mi Mayor combinación 6
    Rule MI_M_6 = new Rule(basedereglas,"MI_M_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Si"),
        new Clause(Nota2,igual,"Sol#"),
    new Clause(Nota3,igual,"Mi")},
       new Clause(ResultadoAcorde,igual,"Mi Mayor")
    ); 
    
    
    //Acorde Mi Menor combinación 1
    Rule MI_m_1 = new Rule(basedereglas,"MI_m_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Mi"),
        new Clause(Nota2,igual,"Sol"),
    new Clause(Nota3,igual,"Si")},
       new Clause(ResultadoAcorde,igual,"Mi Menor")
    ); 
    
    //Acorde Mi Menor combinación 2
    Rule MI_m_2 = new Rule(basedereglas,"MI_m_2",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Mi"),
        new Clause(Nota2,igual,"Si"),
    new Clause(Nota3,igual,"Sol")},
       new Clause(ResultadoAcorde,igual,"Mi Menor")
    ); 
    
    //Acorde Mi Menor combinación 3
    Rule MI_m_3 = new Rule(basedereglas,"MI_m_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol"),
        new Clause(Nota2,igual,"Mi"),
    new Clause(Nota3,igual,"Si")},
       new Clause(ResultadoAcorde,igual,"Mi Menor")
    ); 
    
    //Acorde Mi Menor combinación 4
    Rule MI_m_4 = new Rule(basedereglas,"MI_m_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol"),
        new Clause(Nota2,igual,"Si"),
    new Clause(Nota3,igual,"Mi")},
       new Clause(ResultadoAcorde,igual,"Mi Menor")
    ); 
    
    //Acorde Mi Menor combinación 5
    Rule MI_m_5 = new Rule(basedereglas,"MI_m_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Si"),
        new Clause(Nota2,igual,"Mi"),
    new Clause(Nota3,igual,"Sol")},
       new Clause(ResultadoAcorde,igual,"Mi Menor")
    ); 
    
    //Acorde Mi Menor combinación 6
    Rule MI_m_6 = new Rule(basedereglas,"MI_m_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Si"),
        new Clause(Nota2,igual,"Sol"),
    new Clause(Nota3,igual,"Mi")},
       new Clause(ResultadoAcorde,igual,"Mi Menor")
    ); 
    
    
    //Acorde Fa Mayor combinación 1
    Rule FA_M_1 = new Rule(basedereglas,"FA_M_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Fa"),
        new Clause(Nota2,igual,"La"),
    new Clause(Nota3,igual,"Do")},
       new Clause(ResultadoAcorde,igual,"Fa Mayor")
    ); 
    
    //Acorde Fa Mayor combinación 2
    Rule FA_M_2 = new Rule(basedereglas,"FA_M_2",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Fa"),
        new Clause(Nota2,igual,"Do"),
    new Clause(Nota3,igual,"La")},
       new Clause(ResultadoAcorde,igual,"Fa Mayor")
    ); 
    
    //Acorde Fa Mayor combinación 3
    Rule FA_M_3 = new Rule(basedereglas,"FA_M_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"La"),
        new Clause(Nota2,igual,"Do"),
    new Clause(Nota3,igual,"Fa")},
       new Clause(ResultadoAcorde,igual,"Fa Mayor")
    ); 
    
    //Acorde Fa Mayor combinación 4
    Rule FA_M_4 = new Rule(basedereglas,"FA_M_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"La"),
        new Clause(Nota2,igual,"Fa"),
    new Clause(Nota3,igual,"Do")},
       new Clause(ResultadoAcorde,igual,"Fa Mayor")
    ); 
    
    //Acorde Fa Mayor combinación 5
    Rule FA_M_5 = new Rule(basedereglas,"FA_M_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Do"),
        new Clause(Nota2,igual,"Fa"),
    new Clause(Nota3,igual,"La")},
       new Clause(ResultadoAcorde,igual,"Fa Mayor")
    ); 
    
    //Acorde Fa Mayor combinación 6
    Rule FA_M_6 = new Rule(basedereglas,"FA_M_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Do"),
        new Clause(Nota2,igual,"La"),
    new Clause(Nota3,igual,"Fa")},
       new Clause(ResultadoAcorde,igual,"Fa Mayor")
    ); 
    
    
    //Acorde Fa Menor combinación 1
    Rule FA_m_1 = new Rule(basedereglas,"FA_m_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Fa"),
        new Clause(Nota2,igual,"Sol#"),
    new Clause(Nota3,igual,"Do")},
       new Clause(ResultadoAcorde,igual,"Fa Menor")
    ); 
    
    //Acorde Fa Menor combinación 2
    Rule FA_m_2 = new Rule(basedereglas,"FA_m_2",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Fa"),
        new Clause(Nota2,igual,"Do"),
    new Clause(Nota3,igual,"Sol#")},
       new Clause(ResultadoAcorde,igual,"Fa Menor")
    ); 
    
    //Acorde Fa Menor combinación 3
    Rule FA_m_3 = new Rule(basedereglas,"FA_m_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol#"),
        new Clause(Nota2,igual,"Do"),
    new Clause(Nota3,igual,"Fa")},
       new Clause(ResultadoAcorde,igual,"Fa Menor")
    ); 
    
    //Acorde Fa Menor combinación 4
    Rule FA_m_4 = new Rule(basedereglas,"FA_m_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol#"),
        new Clause(Nota2,igual,"Fa"),
    new Clause(Nota3,igual,"Do")},
       new Clause(ResultadoAcorde,igual,"Fa Menor")
    ); 
    
    //Acorde Fa Menor combinación 5
    Rule FA_m_5 = new Rule(basedereglas,"FA_m_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Do"),
        new Clause(Nota2,igual,"Fa"),
    new Clause(Nota3,igual,"Sol#")},
       new Clause(ResultadoAcorde,igual,"Fa Menor")
    ); 
    
    //Acorde Fa Menor combinación 6
    Rule FA_m_6 = new Rule(basedereglas,"FA_m_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Do"),
        new Clause(Nota2,igual,"Sol#"),
    new Clause(Nota3,igual,"Fa")},
       new Clause(ResultadoAcorde,igual,"Fa Menor")
    ); 
    
    
    //Acorde Sol Mayor combinación 1
    Rule SOL_M_1 = new Rule(basedereglas,"SOL_M_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol"),
        new Clause(Nota2,igual,"Si"),
    new Clause(Nota3,igual,"Re")},
       new Clause(ResultadoAcorde,igual,"Sol Mayor")
    ); 
    
    //Acorde Sol Mayor combinación 2
    Rule SOL_M_2 = new Rule(basedereglas,"SOL_M_2",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol"),
        new Clause(Nota2,igual,"Re"),
    new Clause(Nota3,igual,"Si")},
       new Clause(ResultadoAcorde,igual,"Sol Mayor")
    ); 
    
    //Acorde Sol Mayor combinación 3
    Rule SOL_M_3 = new Rule(basedereglas,"SOL_M_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Si"),
        new Clause(Nota2,igual,"Sol"),
    new Clause(Nota3,igual,"Re")},
       new Clause(ResultadoAcorde,igual,"Sol Mayor")
    ); 
    
    //Acorde Sol Mayor combinación 4
    Rule SOL_M_4 = new Rule(basedereglas,"SOL_M_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Si"),
        new Clause(Nota2,igual,"Re"),
    new Clause(Nota3,igual,"Sol")},
       new Clause(ResultadoAcorde,igual,"Sol Mayor")
    ); 
    
    //Acorde Sol Mayor combinación 5
    Rule SOL_M_5 = new Rule(basedereglas,"SOL_M_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re"),
        new Clause(Nota2,igual,"Sol"),
    new Clause(Nota3,igual,"Si")},
       new Clause(ResultadoAcorde,igual,"Sol Mayor")
    ); 
    
    //Acorde Sol Mayor combinación 6
    Rule SOL_M_6 = new Rule(basedereglas,"SOL_M_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re"),
        new Clause(Nota2,igual,"Si"),
    new Clause(Nota3,igual,"Sol")},
       new Clause(ResultadoAcorde,igual,"Sol Mayor")
    ); 
    
    
     //Acorde Sol Menor combinación 1
    Rule SOL_m_1 = new Rule(basedereglas,"SOL_m_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol"),
        new Clause(Nota2,igual,"La#"),
    new Clause(Nota3,igual,"Re")},
       new Clause(ResultadoAcorde,igual,"Sol Menor")
    ); 
    
    //Acorde Sol Menor combinación 2
    Rule SOL_m_2 = new Rule(basedereglas,"SOL_m_2",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Sol"),
        new Clause(Nota2,igual,"Re"),
    new Clause(Nota3,igual,"La#")},
       new Clause(ResultadoAcorde,igual,"Sol Menor")
    ); 
    
    //Acorde Sol Menor combinación 3
    Rule SOL_m_3 = new Rule(basedereglas,"SOL_m_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"La#"),
        new Clause(Nota2,igual,"Sol"),
    new Clause(Nota3,igual,"Re")},
       new Clause(ResultadoAcorde,igual,"Sol Menor")
    ); 
    
    //Acorde Sol Menor combinación 4
    Rule SOL_m_4 = new Rule(basedereglas,"SOL_m_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"La#"),
        new Clause(Nota2,igual,"Re"),
    new Clause(Nota3,igual,"Sol")},
       new Clause(ResultadoAcorde,igual,"Sol Menor")
    ); 
    
    //Acorde Sol Menor combinación 5
    Rule SOL_m_5 = new Rule(basedereglas,"SOL_m_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re"),
        new Clause(Nota2,igual,"Sol"),
    new Clause(Nota3,igual,"La#")},
       new Clause(ResultadoAcorde,igual,"Sol Menor")
    ); 
    
    //Acorde Sol Menor combinación 6
    Rule SOL_m_6 = new Rule(basedereglas,"SOL_m_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re"),
        new Clause(Nota2,igual,"La#"),
    new Clause(Nota3,igual,"Sol")},
       new Clause(ResultadoAcorde,igual,"Sol Menor")
    ); 
    
    
    //Acorde La Mayor combinación 1
    Rule LA_M_1 = new Rule(basedereglas,"LA_M_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"La"),
        new Clause(Nota2,igual,"Do#"),
    new Clause(Nota3,igual,"Mi")},
       new Clause(ResultadoAcorde,igual,"La Mayor")
    ); 
    
    //Acorde La Mayor combinación 2
    Rule LA_M_2 = new Rule(basedereglas,"LA_M_2",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"La"),
        new Clause(Nota2,igual,"Mi"),
    new Clause(Nota3,igual,"Do#")},
       new Clause(ResultadoAcorde,igual,"La Mayor")
    ); 
    
    //Acorde La Mayor combinación 3
    Rule LA_M_3 = new Rule(basedereglas,"LA_M_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Do#"),
        new Clause(Nota2,igual,"La"),
    new Clause(Nota3,igual,"Mi")},
       new Clause(ResultadoAcorde,igual,"La Mayor")
    ); 
    
    //Acorde La Mayor combinación 4
    Rule LA_M_4 = new Rule(basedereglas,"LA_M_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Do#"),
        new Clause(Nota2,igual,"Mi"),
    new Clause(Nota3,igual,"La")},
       new Clause(ResultadoAcorde,igual,"La Mayor")
    ); 
    
    //Acorde La Mayor combinación 5
    Rule LA_M_5 = new Rule(basedereglas,"LA_M_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Mi"),
        new Clause(Nota2,igual,"La"),
    new Clause(Nota3,igual,"Do#")},
       new Clause(ResultadoAcorde,igual,"La Mayor")
    ); 
    
    //Acorde La Mayor combinación 6
    Rule LA_M_6 = new Rule(basedereglas,"LA_M_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Mi"),
        new Clause(Nota2,igual,"Do#"),
    new Clause(Nota3,igual,"La")},
       new Clause(ResultadoAcorde,igual,"La Mayor")
    ); 
    
    
    //Acorde La Menor combinación 1
    Rule LA_m_1 = new Rule(basedereglas,"LA_m_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"La"),
        new Clause(Nota2,igual,"Do"),
    new Clause(Nota3,igual,"Mi")},
       new Clause(ResultadoAcorde,igual,"La Menor")
    ); 
    
    //Acorde La Menor combinación 2
    Rule LA_m_2 = new Rule(basedereglas,"LA_m_2",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"La"),
        new Clause(Nota2,igual,"Mi"),
    new Clause(Nota3,igual,"Do")},
       new Clause(ResultadoAcorde,igual,"La Menor")
    ); 
    
    //Acorde La Menor combinación 3
    Rule LA_m_3 = new Rule(basedereglas,"LA_m_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Do"),
        new Clause(Nota2,igual,"La"),
    new Clause(Nota3,igual,"Mi")},
       new Clause(ResultadoAcorde,igual,"La Menor")
    ); 
    
    //Acorde La Menor combinación 4
    Rule LA_m_4 = new Rule(basedereglas,"LA_m_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Do"),
        new Clause(Nota2,igual,"Mi"),
    new Clause(Nota3,igual,"La")},
       new Clause(ResultadoAcorde,igual,"La Menor")
    ); 
    
    //Acorde La Menor combinación 5
    Rule LA_m_5 = new Rule(basedereglas,"LA_m_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Mi"),
        new Clause(Nota2,igual,"La"),
    new Clause(Nota3,igual,"Do")},
       new Clause(ResultadoAcorde,igual,"La Menor")
    ); 
    
    //Acorde La Menor combinación 6
    Rule LA_m_6 = new Rule(basedereglas,"LA_m_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Mi"),
        new Clause(Nota2,igual,"Do"),
    new Clause(Nota3,igual,"La")},
       new Clause(ResultadoAcorde,igual,"La Menor")
    ); 
    
    
    //Acorde Si Mayor combinación 1
    Rule SI_M_1 = new Rule(basedereglas,"SI_M_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Si"),
        new Clause(Nota2,igual,"Re#"),
    new Clause(Nota3,igual,"Fa#")},
       new Clause(ResultadoAcorde,igual,"Si Mayor")
    ); 
    
    //Acorde Si Mayor combinación 2
    Rule SI_M_2 = new Rule(basedereglas,"SI_M_2",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Si"),
        new Clause(Nota2,igual,"Fa#"),
    new Clause(Nota3,igual,"Re#")},
       new Clause(ResultadoAcorde,igual,"Si Mayor")
    ); 
    
    //Acorde Si Mayor combinación 3
    Rule SI_M_3 = new Rule(basedereglas,"SI_M_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re#"),
        new Clause(Nota2,igual,"Si"),
    new Clause(Nota3,igual,"Fa#")},
       new Clause(ResultadoAcorde,igual,"Si Mayor")
    ); 
    
    //Acorde Si Mayor combinación 4
    Rule SI_M_4 = new Rule(basedereglas,"SI_M_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re#"),
        new Clause(Nota2,igual,"Fa#"),
    new Clause(Nota3,igual,"Si")},
       new Clause(ResultadoAcorde,igual,"Si Mayor")
    ); 
    
    //Acorde Si Mayor combinación 5
    Rule SI_M_5 = new Rule(basedereglas,"SI_M_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Fa#"),
        new Clause(Nota2,igual,"Si"),
    new Clause(Nota3,igual,"Re#")},
       new Clause(ResultadoAcorde,igual,"Si Mayor")
    ); 
    
    //Acorde Si Mayor combinación 6
    Rule SI_M_6 = new Rule(basedereglas,"SI_M_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Fa#"),
        new Clause(Nota2,igual,"Re#"),
    new Clause(Nota3,igual,"Si")},
       new Clause(ResultadoAcorde,igual,"Si Mayor")
    ); 
    
    
    //Acorde Si Menor combinación 1
    Rule SI_m_1 = new Rule(basedereglas,"SI_m_1",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Si"),
        new Clause(Nota2,igual,"Re"),
    new Clause(Nota3,igual,"Fa#")},
       new Clause(ResultadoAcorde,igual,"Si Menor")
    ); 
    
    //Acorde Si Menor combinación 2
    Rule SI_m_2 = new Rule(basedereglas,"SI_m_2",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Si"),
        new Clause(Nota2,igual,"Fa#"),
    new Clause(Nota3,igual,"Re")},
       new Clause(ResultadoAcorde,igual,"Si Menor")
    ); 
    
    //Acorde Si Menor combinación 3
    Rule SI_m_3 = new Rule(basedereglas,"SI_m_3",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re"),
        new Clause(Nota2,igual,"Si"),
    new Clause(Nota3,igual,"Fa#")},
       new Clause(ResultadoAcorde,igual,"Si Menor")
    ); 
    
    //Acorde Si Menor combinación 4
    Rule SI_m_4 = new Rule(basedereglas,"SI_m_4",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Re"),
        new Clause(Nota2,igual,"Fa#"),
    new Clause(Nota3,igual,"Si")},
       new Clause(ResultadoAcorde,igual,"Si Menor")
    ); 
    
    //Acorde Si Menor combinación 5
    Rule SI_m_5 = new Rule(basedereglas,"SI_m_5",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Fa#"),
        new Clause(Nota2,igual,"Si"),
    new Clause(Nota3,igual,"Re")},
       new Clause(ResultadoAcorde,igual,"Si Menor")
    ); 
    
    //Acorde Si Menor combinación 6
    Rule SI_m_6 = new Rule(basedereglas,"SI_m_6",//Ojito 
    new Clause[]{
    new Clause(Nota1,igual,"Fa#"),
        new Clause(Nota2,igual,"Re"),
    new Clause(Nota3,igual,"Si")},
       new Clause(ResultadoAcorde,igual,"Si Menor")
    ); 
    

    
    
    
    
    
    
    
    
    
    }
    
    
    
}
