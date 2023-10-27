package com.dof100.morsenotifier;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: com.dof100.morsenotifier.c */
class C0132c extends ArrayAdapter<C0130a> implements View.OnClickListener {

    /* renamed from: a */
    private final Context f447a;

    /* renamed from: b */
    private C0131b f448b;

    /* renamed from: c */
    private final LayoutInflater f449c = ((LayoutInflater) this.f447a.getSystemService("layout_inflater"));

    /* renamed from: d */
    private final C0133a f450d;

    /* renamed from: com.dof100.morsenotifier.c$a */
    public interface C0133a {
        /* renamed from: a */
        void mo347a(C0130a aVar, int i, View view);
    }

    public C0132c(Context context, C0131b bVar, C0133a aVar) {
        super(context, R.layout.activity_appfilters_listitem, bVar.f446a);
        C0140i.m501a("MyAppFiltersArrayAdapter.constructor");
        this.f447a = context;
        this.f448b = bVar;
        this.f450d = aVar;
    }

    /* renamed from: a */
    public void mo470a() {
        insert(new C0130a(), this.f448b.f446a.size());
        this.f448b.mo469b(this.f447a);
        notifyDataSetChanged();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C0140i.m501a("MyAppFiltersArrayAdapter.getView position=" + i + "  v=" + view);
        C0130a aVar = this.f448b.f446a.get(i);
        if (view == null) {
            view = this.f449c.inflate(R.layout.activity_appfilters_listitem, viewGroup, false);
        }
        view.setTag(aVar);
        TextView textView = (TextView) view.findViewById(R.id.tv_info);
        textView.setTag(aVar);
        textView.setText(String.format(Locale.US, "%d. %s", new Object[]{Integer.valueOf(i + 1), aVar.mo464a(this.f447a)}));
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.b_edit);
        imageButton.setTag(aVar);
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.b_delete);
        imageButton2.setTag(aVar);
        imageButton2.setOnClickListener(this);
        return view;
    }

    public void onClick(View view) {
        String str;
        if (view != null) {
            C0140i.m501a("MyAppFiltersArrayAdapter.onClick");
            C0130a aVar = (C0130a) view.getTag();
            if (aVar == null) {
                C0140i.m500a(this.f447a, "MyAppFiltersArrayAdapter.onClick ERROR f=null");
                return;
            }
            C0140i.m501a("MyAppFiltersArrayAdapter.onClick f.package=" + aVar.f436a);
            int indexOf = this.f448b.f446a.indexOf(aVar);
            C0140i.m501a("MyAppFiltersArrayAdapter.onClick index=" + indexOf);
            if (view.getId() == R.id.b_delete) {
                str = "MyAppFiltersArrayAdapter.onClick b_delete";
            } else if (view.getId() == R.id.b_edit) {
                str = "MyAppFiltersArrayAdapter.onClick b_edit";
            } else {
                return;
            }
            C0140i.m501a(str);
            this.f450d.mo347a(aVar, indexOf, view);
        }
    }
}
