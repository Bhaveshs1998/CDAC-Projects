
import java.util.Scanner;
public class BinarySearchTree{

	private Person root;
	
	public BinarySearchTree(){
		
		root = null;
	
	}
	
	public boolean isEmpty(){
		return (root == null);
		
	}
	//-----------------------------------------------------------------------
	//insert by recursion-------------------------------------------------
	/*
	public void insert (int x,String name,String Address,int Contact){
		
		root = insert(root ,x,name,Address,Contact);
	}
	
	private Person insert(Person p , int x,String name,String Address,String Contact){
		if(p==null)//inserting first element
			p=new Person(x , name , Address , Contact);
		else if (x < p.flatNo )
			p.lchild = insert(p.lchild,x);
		else if (x > p.flatNo)
			p.rchild =  inser(p.rchild,x);
		else 
			System.out.println(x +"already present in tree");
		return p;
			
		
	}
	*/
	//----------------------------------------------------------------------------
	//insert by iteration-------------------------------------------------------
	public void insert1(int x,String name,String Address,String Contact){
		Person p = root;
		Person  par = null;
		
		while(p != null){
			par = p;
			if(x < p.flatNo)
				p=p.lchild;
			else if(x>p.flatNo)
				p=p.rchild;
			else{
				System.out.println(x +" already present in the tree");
				return;
			}
		}
	
	
		Person temp = new Person(x,name,Address,Contact);
		if(par == null)
			root =temp;
		else if(x<par.flatNo)
			par.lchild = temp;
		else 
			par.rchild = temp;
	}
	//----------------------------------------------------------
	// search by recursion-------------------------------------------------------------------------------------------------
	public boolean search(int x){
		return(search(root,x)!=null);
	}
	
	private Person search(Person p , int x){
		if(p == null)//key is not found
			return null;//key is not found
		if(x<p.flatNo)//search in the left subtree
			return search(p.lchild,x);
		else if(x>p.flatNo)//search in right subtree
			return search(p.rchild,x);
		return p; //key found
	}
	//-----------------------------------------------------------------
	//search by iteration----------------------------------------------------------------
	
	public boolean search1(int x){
		Person p = root ;
		while(p!= null){
			if(x<p.flatNo)
				p = p.lchild; // search in left child
			else if(x>p.flatNo)
				p=p.rchild;//search in right child
			else
				return true;
		}
		
		return false;
	}
	//----------------------------------------------------------------------------
	//delete by iteration-------------------------------------------------------
	
	public void delete1(int x){
		Person p = root;
		Person par = null;
		//in this loop we are searching flatNo-----------------------------------
		while(p!= null){
			if( x == p.flatNo)
				break;
			par = p;
			if(x<p.flatNo)
				p = p.lchild;
			else
				p = p.rchild; 
		}
		//-------------------------------------------------------------------------
		if(p== null){
			System.out.println(x+"not found");
			return;
		}
		//if person class object of flatNo  is having having two child we will find in order successor------
		Person s,ps;
		if(p.lchild != null && p.rchild != null){
			ps = p;
			s = p.rchild;
			
			while(s.lchild!=null){
				ps=s;//ps is parent(baap )of s
				s=s.lchild;
			}
			
			p.flatNo = s.flatNo;
			p=s;//
			par =ps;//
			
		}
		// after above condition , we have to delete object hold by par 
		//which is s (i.e one child of par)
		
		//Now case for 1 child or no child-----------------------------------------
		
		Person ch;
		if(p.lchild!=null)
			ch =p.lchild;
		else
			ch= p.rchild;
		
		//if parent is null so ch is null
		if(par==null)
			root = ch; // therefore root is also null
		else if (p == par.lchild)//if p is parent of s which is left child 
			par.lchild=ch;
		else//if p is parent of s which is right child 
			par.rchild=ch;
		//	---------------------------
		
	}
	//-----------------------------------------------------------------
	
	//display----------------------------------------------
	
	public void display (){
		
		display(root,0);
		System.out.println("    ");
	}
	
	private void display (Person p,int level){
		
		
		int i;
		
		if(p == null)
			return;
		
		display(p.rchild,level+1);
	    System.out.println();
		
		System.out.print(p);
		
		display(p.lchild ,level + 1);
		
		System.out.print(" ");
	}
	
	//------------------------------------------------------------
		
		
		
		
		
}
	




	