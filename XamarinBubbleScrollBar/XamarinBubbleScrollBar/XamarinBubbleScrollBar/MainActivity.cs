using Android.App;
using Android.OS;
using Android.Support.V7.App;
using Android.Runtime;
using Android.Widget;
using Android.Support.V7.Widget;
using System.Collections.Generic;
using Trendyol.BubbleScrollBarLib;
using System;
using System.Text;

namespace XamarinBubbleScrollBar
{
    [Activity(Label = "@string/app_name", Theme = "@style/AppTheme", MainLauncher = true)]
    public class MainActivity : AppCompatActivity, IBubbleTextProvider
    {

        RecyclerView recyclerView;
        List<string> listData = new List<string>();
        LinearLayoutManager layoutManager;
        BubbleScrollBar bubbleScrollBar;

        public string ProvideBubbleText(int position)
        {
            return new StringBuilder(listData[position].Substring(0, 1)).ToString();
        }

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.activity_main);

            InitData();

            //View
            recyclerView = FindViewById<RecyclerView>(Resource.Id.recyclerView);
            recyclerView.HasFixedSize = true;
            layoutManager = new LinearLayoutManager(this);
            recyclerView.SetLayoutManager(layoutManager);
            recyclerView.AddItemDecoration(new DividerItemDecoration(this, layoutManager.Orientation));

            recyclerView.SetAdapter(new MyAdapter(listData));

            bubbleScrollBar = FindViewById<BubbleScrollBar>(Resource.Id.fastscroll);
            bubbleScrollBar.AttachToRecyclerView(recyclerView);
            bubbleScrollBar.BubbleTextProvider = this;
        }

        private void InitData()
        {
            listData.Add("Arnob");
            listData.Add("Anondita");
            listData.Add("Anas");
            listData.Add("Anis");
            listData.Add("Afzal");

            listData.Add("Shakil");
            listData.Add("Shuvo");
            listData.Add("Shanti");
            listData.Add("Sumiya");
            listData.Add("Shrabonty");

            listData.Add("Kamrul");
            listData.Add("Korim");
            listData.Add("Kamal");
            listData.Add("Kemi");
            listData.Add("Kanta");

            listData.Add("Tanmoy");
            listData.Add("Tanha");
            listData.Add("Tomal");
            listData.Add("Tom");
            listData.Add("Tapos");

            listData.Add("Nishan");
            listData.Add("Nowrin");
            listData.Add("Nadia");
            listData.Add("Nabila");
            listData.Add("Nowsin");

            listData.Add("Rima");
            listData.Add("Rohim");
            listData.Add("Rebeka");
            listData.Add("Rabbi");
            listData.Add("Rohima");

            listData.Add("Mimi");
            listData.Add("Mitu");
            listData.Add("Mizan");
            listData.Add("Minhaj");
            listData.Add("Mitul");

            listData.Add("Limu");
            listData.Add("Liton");
            listData.Add("Lima");
            listData.Add("Lamiya");
            listData.Add("Lamima");
        }
    }
}