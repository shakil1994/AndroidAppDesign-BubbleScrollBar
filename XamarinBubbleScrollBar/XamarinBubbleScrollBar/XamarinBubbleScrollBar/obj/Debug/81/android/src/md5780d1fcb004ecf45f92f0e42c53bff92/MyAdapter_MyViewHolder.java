package md5780d1fcb004ecf45f92f0e42c53bff92;


public class MyAdapter_MyViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("XamarinBubbleScrollBar.MyAdapter+MyViewHolder, XamarinBubbleScrollBar", MyAdapter_MyViewHolder.class, __md_methods);
	}


	public MyAdapter_MyViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == MyAdapter_MyViewHolder.class)
			mono.android.TypeManager.Activate ("XamarinBubbleScrollBar.MyAdapter+MyViewHolder, XamarinBubbleScrollBar", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
