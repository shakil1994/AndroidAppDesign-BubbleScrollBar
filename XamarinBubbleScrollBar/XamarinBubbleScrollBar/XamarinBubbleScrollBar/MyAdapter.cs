using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Support.V7.Widget;
using Android.Views;
using Android.Widget;

namespace XamarinBubbleScrollBar
{
    public class MyAdapter : RecyclerView.Adapter
    {
        private List<String> listData;
        public MyAdapter (List<String> listData)
        {
            this.listData = listData;
        }

        public override int ItemCount => listData.Count;

        public override void OnBindViewHolder(RecyclerView.ViewHolder holder, int position)
        {
            MyViewHolder myViewHolder = holder as MyViewHolder;
            myViewHolder.txt_name.Text = listData[position];
        }

        public override RecyclerView.ViewHolder OnCreateViewHolder(ViewGroup parent, int viewType)
        {
            View itemView = LayoutInflater.From(parent.Context).Inflate(Resource.Layout.layout_item, parent, false);
            return new MyViewHolder(itemView);
        }

        private class MyViewHolder : RecyclerView.ViewHolder
        {
            public TextView txt_name;
            public MyViewHolder(View itemView) : base(itemView)
            {
                txt_name = itemView.FindViewById<TextView>(Resource.Id.txt_name);
            }
        }
    }
}