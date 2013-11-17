public class Matrix{
	private int width;
	private int height;
	private double[][] data;
	
	public Matrix(int w,int h){
		width = w;
		height = h;
		data = new double[h][w];
	}

	public void setValue(int x,int y,double value){
		data[x][y] = value;
	}

	public double getValue(int x,int y){
		return data[x][y];
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	private double[] getValueByX(int x){
		return data[x];
	}

	private double[] getValueByY(int y){
		double[] values = new double[height];
		for(int i=0;i<height;i++){
			values[i] = data[i][y]; 
		}
		return values;
	}

	public void setValue(int x,double[] values){
		if (values.length != width)
			throw new Exception("value's length is not match the matrix's width");
		data[x] = values;
	}
	
	public static Matrix multiMatrix(Matrix first,Matrix second){
		if(first.getWidth() != second.getHeight()){
			throw new Exception("the first matrix's width is not equal to the second one's height");
		}
		int 
		Matrix third = new Matrix(first.getHeight(),second.getWidth());
		for(int i=0;i<third.getHeight();i++){
			for(int j=0;j<third.getWidth();j++){
				for(int k=0;k<first.getWidth();k++){
					
				}
