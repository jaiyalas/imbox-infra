package org.imbox.infrastructure.file;

// BlockRec is a block withour content
public class FileRecH{
    private String name;
    private String currentMD5;
    private String pastMD55;

    public String getName() {return this.name;}
    public String getCurrentMD5() {return this.currentMD5;}
    public String getPastMD55()   {return this.pastMD55;}

    private FileRecH(){};
    public FileRecH(String _n,String _c,String _p){
	this.name = _n;
	this.currentMD5 = _c;
	this.pastMD55 = _p;
    };
};
