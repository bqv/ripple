package com.dof100.morsenotifier;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

/* renamed from: com.dof100.morsenotifier.r */
class C0158r extends ArrayAdapter<C0156p> implements View.OnClickListener {

    /* renamed from: a */
    private final Context f539a;

    /* renamed from: b */
    private C0157q f540b;

    /* renamed from: c */
    private final LayoutInflater f541c = ((LayoutInflater) this.f539a.getSystemService("layout_inflater"));

    /* renamed from: d */
    private final C0159a f542d;

    /* renamed from: com.dof100.morsenotifier.r$a */
    public interface C0159a {
        /* renamed from: a */
        void mo395a(C0156p pVar, int i, View view);
    }

    public C0158r(Context context, C0157q qVar, C0159a aVar) {
        super(context, R.layout.activity_reminders_listitem, qVar.f538a);
        C0140i.m501a("MyRemindersArrayAdapter.constructor");
        this.f539a = context;
        this.f540b = qVar;
        this.f542d = aVar;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C0140i.m501a("MyRemindersArrayAdapter.getView position=" + i + "  v=" + view);
        C0156p pVar = this.f540b.f538a.get(i);
        if (view == null) {
            view = this.f541c.inflate(R.layout.activity_reminders_listitem, viewGroup, false);
        }
        view.setTag(pVar);
        TextView textView = (TextView) view.findViewById(R.id.tv_info);
        textView.setTag(pVar);
        textView.setText(pVar.mo511a(this.f539a));
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.b_edit);
        imageButton.setTag(pVar);
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.b_delete);
        imageButton2.setTag(pVar);
        imageButton2.setOnClickListener(this);
        return view;
    }

    public void onClick(View view) {
        String str;
        if (view != null) {
            C0140i.m501a("MyRemindersArrayAdapter.onClick");
            C0156p pVar = (C0156p) view.getTag();
            if (pVar == null) {
                C0140i.m500a(this.f539a, "MyRemindersArrayAdapter.onClick ERROR f=null");
                return;
            }
            int indexOf = this.f540b.f538a.indexOf(pVar);
            C0140i.m501a("MyRemindersArrayAdapter.onClick index=" + indexOf);
            if (view.getId() == R.id.b_delete) {
                str = "MyRemindersArrayAdapter.onClick b_delete";
            } else if (view.getId() == R.id.b_edit) {
                str = "MyRemindersArrayAdapter.onClick b_edit";
            } else {
                return;
            }
            C0140i.m501a(str);
            this.f542d.mo395a(pVar, indexOf, view);
        }
    }
}
