
class connectDB{
    private static connectDB db;
    public static connectDB getDB() {
        if(db == null) 
            db = new connectDB();
        return db;
    }
}

class Main{
    public static void main(String[] args){
        // connectDB db = new connectDB();  <- can't create class by defualt init
        connectDB db = connectDB.getDB();
        
        connectDB db_2 =  connectDB.getDB();  
        // not create new db but return db
        
    }
}