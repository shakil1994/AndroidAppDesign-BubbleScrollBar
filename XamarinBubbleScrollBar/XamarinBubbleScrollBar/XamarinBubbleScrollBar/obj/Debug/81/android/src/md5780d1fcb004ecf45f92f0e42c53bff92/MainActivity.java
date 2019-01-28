package md5780d1fcb004ecf45f92f0e42c53bff92;


public class MainActivity
	extends android.support.v7.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer,
		com.trendyol.bubblescrollbarlib.BubbleTextProvider
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_provideBubbleText:(I)Ljava/lang/String;:GetProvideBubbleText_IHandler:Trendyol.BubbleScrollBarLib.IBubbleTextProviderInvoker, BubbleScrollBar\n" +
			"";
		mono.android.Runtime.register ("XamarinBubbleScrollBar.MainActivity, XamarinBubbleScrollBar", MainActivity.class, __md_methods);
	}


	public MainActivity ()
	{
		super ();
		if (getClass () == MainActivity.class)
			mono.android.TypeManager.Activate ("XamarinBubbleScrollBar.MainActivity, XamarinBubbleScrollBar", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public java.lang.String provideBubbleText (int p0)
	{
		return n_provideBubbleText (p0);
	}

	private native java.lang.String n_provideBubbleText (int p0);

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
