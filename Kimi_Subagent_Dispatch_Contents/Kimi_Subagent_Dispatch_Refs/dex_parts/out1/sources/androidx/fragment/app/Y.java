package androidx.fragment.app;

import G2.InterfaceC0228k;
import Ie.K0;
import Q1.C0540z0;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC0917o;
import androidx.lifecycle.InterfaceC0924w;
import d.C1101x;
import d.InterfaceC1102y;
import f3.AbstractC1206d;
import j0.M0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k3.C1472a;
import kotlin.jvm.internal.Intrinsics;
import s3.AbstractC1983e;
import v2.InterfaceC2145e;
import v2.InterfaceC2146f;
import vb.C2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public g.g f12605A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public g.g f12606B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayDeque f12607C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f12608D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f12609E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f12610F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f12611G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f12612H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f12613I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f12614J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ArrayList f12615K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public c0 f12616L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final RunnableC0884g f12617M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12619b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f12621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f12622e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1101x f12624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O f12625h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0883f f12628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f12629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final M f12630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final M f12631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final M f12632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final M f12633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final P f12634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public J f12636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public H f12637u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public B f12638v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public B f12639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Q f12640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Y6.h f12641y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g.g f12642z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12618a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f12620c = new h0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L f12623f = new L(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f12626i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f12627j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.M] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.M] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.M] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.M] */
    public Y() {
        final int i4 = 0;
        this.f12625h = new O(i4, this);
        Collections.synchronizedMap(new HashMap());
        this.f12628l = new C0883f(this);
        this.f12629m = new CopyOnWriteArrayList();
        this.f12630n = new F2.a(this) { // from class: androidx.fragment.app.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y f12590b;

            {
                this.f12590b = this;
            }

            @Override // F2.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        Y y9 = this.f12590b;
                        if (y9.H()) {
                            y9.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Y y10 = this.f12590b;
                        if (y10.H() && num.intValue() == 80) {
                            y10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        t2.i iVar = (t2.i) obj;
                        Y y11 = this.f12590b;
                        if (y11.H()) {
                            y11.m(iVar.f24917a, false);
                        }
                        break;
                    default:
                        t2.w wVar = (t2.w) obj;
                        Y y12 = this.f12590b;
                        if (y12.H()) {
                            y12.r(wVar.f24952a, false);
                        }
                        break;
                }
            }
        };
        final int i9 = 1;
        this.f12631o = new F2.a(this) { // from class: androidx.fragment.app.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y f12590b;

            {
                this.f12590b = this;
            }

            @Override // F2.a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        Y y9 = this.f12590b;
                        if (y9.H()) {
                            y9.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Y y10 = this.f12590b;
                        if (y10.H() && num.intValue() == 80) {
                            y10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        t2.i iVar = (t2.i) obj;
                        Y y11 = this.f12590b;
                        if (y11.H()) {
                            y11.m(iVar.f24917a, false);
                        }
                        break;
                    default:
                        t2.w wVar = (t2.w) obj;
                        Y y12 = this.f12590b;
                        if (y12.H()) {
                            y12.r(wVar.f24952a, false);
                        }
                        break;
                }
            }
        };
        final int i10 = 2;
        this.f12632p = new F2.a(this) { // from class: androidx.fragment.app.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y f12590b;

            {
                this.f12590b = this;
            }

            @Override // F2.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        Y y9 = this.f12590b;
                        if (y9.H()) {
                            y9.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Y y10 = this.f12590b;
                        if (y10.H() && num.intValue() == 80) {
                            y10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        t2.i iVar = (t2.i) obj;
                        Y y11 = this.f12590b;
                        if (y11.H()) {
                            y11.m(iVar.f24917a, false);
                        }
                        break;
                    default:
                        t2.w wVar = (t2.w) obj;
                        Y y12 = this.f12590b;
                        if (y12.H()) {
                            y12.r(wVar.f24952a, false);
                        }
                        break;
                }
            }
        };
        final int i11 = 3;
        this.f12633q = new F2.a(this) { // from class: androidx.fragment.app.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y f12590b;

            {
                this.f12590b = this;
            }

            @Override // F2.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        Y y9 = this.f12590b;
                        if (y9.H()) {
                            y9.h(false, configuration);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Y y10 = this.f12590b;
                        if (y10.H() && num.intValue() == 80) {
                            y10.l(false);
                            break;
                        }
                        break;
                    case 2:
                        t2.i iVar = (t2.i) obj;
                        Y y11 = this.f12590b;
                        if (y11.H()) {
                            y11.m(iVar.f24917a, false);
                        }
                        break;
                    default:
                        t2.w wVar = (t2.w) obj;
                        Y y12 = this.f12590b;
                        if (y12.H()) {
                            y12.r(wVar.f24952a, false);
                        }
                        break;
                }
            }
        };
        this.f12634r = new P(this);
        this.f12635s = -1;
        this.f12640x = new Q(this);
        this.f12641y = new Y6.h(16);
        this.f12607C = new ArrayDeque();
        this.f12617M = new RunnableC0884g(4, this);
    }

    public static boolean F(int i4) {
        return Log.isLoggable("FragmentManager", i4);
    }

    public static boolean G(B b10) {
        if (b10.mHasMenu && b10.mMenuVisible) {
            return true;
        }
        boolean zG = false;
        for (B b11 : b10.mChildFragmentManager.f12620c.e()) {
            if (b11 != null) {
                zG = G(b11);
            }
            if (zG) {
                return true;
            }
        }
        return false;
    }

    public static boolean I(B b10) {
        if (b10 == null) {
            return true;
        }
        Y y9 = b10.mFragmentManager;
        return b10.equals(y9.f12639w) && I(y9.f12638v);
    }

    public static void W(B b10) {
        if (F(2)) {
            Log.v("FragmentManager", "show: " + b10);
        }
        if (b10.mHidden) {
            b10.mHidden = false;
            b10.mHiddenChanged = !b10.mHiddenChanged;
        }
    }

    public final B A(String str) {
        h0 h0Var = this.f12620c;
        ArrayList arrayList = (ArrayList) h0Var.f12725a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            B b10 = (B) arrayList.get(size);
            if (b10 != null && str.equals(b10.mTag)) {
                return b10;
            }
        }
        for (g0 g0Var : ((HashMap) h0Var.f12726b).values()) {
            if (g0Var != null) {
                B b11 = g0Var.f12718c;
                if (str.equals(b11.mTag)) {
                    return b11;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(B b10) {
        ViewGroup viewGroup = b10.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (b10.mContainerId <= 0 || !this.f12637u.j()) {
            return null;
        }
        View viewD = this.f12637u.d(b10.mContainerId);
        if (viewD instanceof ViewGroup) {
            return (ViewGroup) viewD;
        }
        return null;
    }

    public final Q C() {
        B b10 = this.f12638v;
        return b10 != null ? b10.mFragmentManager.C() : this.f12640x;
    }

    public final Y6.h D() {
        B b10 = this.f12638v;
        return b10 != null ? b10.mFragmentManager.D() : this.f12641y;
    }

    public final void E(B b10) {
        if (F(2)) {
            Log.v("FragmentManager", "hide: " + b10);
        }
        if (b10.mHidden) {
            return;
        }
        b10.mHidden = true;
        b10.mHiddenChanged = true ^ b10.mHiddenChanged;
        V(b10);
    }

    public final boolean H() {
        B b10 = this.f12638v;
        if (b10 == null) {
            return true;
        }
        return b10.isAdded() && this.f12638v.getParentFragmentManager().H();
    }

    public final void J(int i4, boolean z10) {
        J j2;
        if (this.f12636t == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i4 != this.f12635s) {
            this.f12635s = i4;
            h0 h0Var = this.f12620c;
            HashMap map = (HashMap) h0Var.f12726b;
            Iterator it = ((ArrayList) h0Var.f12725a).iterator();
            while (it.hasNext()) {
                g0 g0Var = (g0) map.get(((B) it.next()).mWho);
                if (g0Var != null) {
                    g0Var.j();
                }
            }
            for (g0 g0Var2 : map.values()) {
                if (g0Var2 != null) {
                    g0Var2.j();
                    B b10 = g0Var2.f12718c;
                    if (b10.mRemoving && !b10.isInBackStack()) {
                        if (b10.mBeingSaved && !((HashMap) h0Var.f12727c).containsKey(b10.mWho)) {
                            g0Var2.m();
                        }
                        h0Var.h(g0Var2);
                    }
                }
            }
            for (g0 g0Var3 : h0Var.d()) {
                B b11 = g0Var3.f12718c;
                if (b11.mDeferStart) {
                    if (this.f12619b) {
                        this.f12612H = true;
                    } else {
                        b11.mDeferStart = false;
                        g0Var3.j();
                    }
                }
            }
            if (this.f12608D && (j2 = this.f12636t) != null && this.f12635s == 7) {
                ((E) j2).f12567e.invalidateOptionsMenu();
                this.f12608D = false;
            }
        }
    }

    public final void K() {
        if (this.f12636t == null) {
            return;
        }
        this.f12609E = false;
        this.f12610F = false;
        this.f12616L.f12690g = false;
        for (B b10 : this.f12620c.f()) {
            if (b10 != null) {
                b10.noteStateNotSaved();
            }
        }
    }

    public final boolean L() {
        x(false);
        w(true);
        B b10 = this.f12639w;
        if (b10 != null && b10.getChildFragmentManager().L()) {
            return true;
        }
        boolean zM = M(this.f12613I, this.f12614J, -1, 0);
        if (zM) {
            this.f12619b = true;
            try {
                O(this.f12613I, this.f12614J);
            } finally {
                d();
            }
        }
        Y();
        boolean z10 = this.f12612H;
        h0 h0Var = this.f12620c;
        if (z10) {
            this.f12612H = false;
            for (g0 g0Var : h0Var.d()) {
                B b11 = g0Var.f12718c;
                if (b11.mDeferStart) {
                    if (this.f12619b) {
                        this.f12612H = true;
                    } else {
                        b11.mDeferStart = false;
                        g0Var.j();
                    }
                }
            }
        }
        ((HashMap) h0Var.f12726b).values().removeAll(Collections.singleton(null));
        return zM;
    }

    public final boolean M(ArrayList arrayList, ArrayList arrayList2, int i4, int i9) {
        boolean z10 = (i9 & 1) != 0;
        ArrayList arrayList3 = this.f12621d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i4 < 0) {
                size = z10 ? 0 : this.f12621d.size() - 1;
            } else {
                int size2 = this.f12621d.size() - 1;
                while (size2 >= 0) {
                    C0878a c0878a = (C0878a) this.f12621d.get(size2);
                    if (i4 >= 0 && i4 == c0878a.f12659r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z10) {
                    size = size2;
                    while (size > 0) {
                        C0878a c0878a2 = (C0878a) this.f12621d.get(size - 1);
                        if (i4 < 0 || i4 != c0878a2.f12659r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f12621d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f12621d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0878a) this.f12621d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void N(B b10) {
        if (F(2)) {
            Log.v("FragmentManager", "remove: " + b10 + " nesting=" + b10.mBackStackNesting);
        }
        boolean zIsInBackStack = b10.isInBackStack();
        if (b10.mDetached && zIsInBackStack) {
            return;
        }
        h0 h0Var = this.f12620c;
        synchronized (((ArrayList) h0Var.f12725a)) {
            ((ArrayList) h0Var.f12725a).remove(b10);
        }
        b10.mAdded = false;
        if (G(b10)) {
            this.f12608D = true;
        }
        b10.mRemoving = true;
        V(b10);
    }

    public final void O(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i4 = 0;
        int i9 = 0;
        while (i4 < size) {
            if (!((C0878a) arrayList.get(i4)).f12656o) {
                if (i9 != i4) {
                    y(arrayList, arrayList2, i9, i4);
                }
                i9 = i4 + 1;
                if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                    while (i9 < size && ((Boolean) arrayList2.get(i9)).booleanValue() && !((C0878a) arrayList.get(i9)).f12656o) {
                        i9++;
                    }
                }
                y(arrayList, arrayList2, i4, i9);
                i4 = i9 - 1;
            }
            i4++;
        }
        if (i9 != size) {
            y(arrayList, arrayList2, i9, size);
        }
    }

    public final void P(Parcelable parcelable) {
        C0883f c0883f;
        int i4;
        boolean z10;
        int i9;
        g0 g0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f12636t.f12583b.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<e0> arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f12636t.f12583b.getClassLoader());
                arrayList.add((e0) bundle.getParcelable("state"));
            }
        }
        h0 h0Var = this.f12620c;
        HashMap map = (HashMap) h0Var.f12727c;
        HashMap map2 = (HashMap) h0Var.f12726b;
        map.clear();
        for (e0 e0Var : arrayList) {
            map.put(e0Var.f12700b, e0Var);
        }
        a0 a0Var = (a0) bundle3.getParcelable("state");
        if (a0Var == null) {
            return;
        }
        map2.clear();
        Iterator it = a0Var.f12660a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0883f = this.f12628l;
            i4 = 2;
            if (!zHasNext) {
                break;
            }
            e0 e0Var2 = (e0) ((HashMap) h0Var.f12727c).remove((String) it.next());
            if (e0Var2 != null) {
                B b10 = (B) this.f12616L.f12685b.get(e0Var2.f12700b);
                if (b10 != null) {
                    if (F(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + b10);
                    }
                    g0Var = new g0(c0883f, h0Var, b10, e0Var2);
                } else {
                    g0Var = new g0(this.f12628l, this.f12620c, this.f12636t.f12583b.getClassLoader(), C(), e0Var2);
                }
                B b11 = g0Var.f12718c;
                b11.mFragmentManager = this;
                if (F(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + b11.mWho + "): " + b11);
                }
                g0Var.k(this.f12636t.f12583b.getClassLoader());
                h0Var.g(g0Var);
                g0Var.f12720e = this.f12635s;
            }
        }
        c0 c0Var = this.f12616L;
        c0Var.getClass();
        Iterator it2 = new ArrayList(c0Var.f12685b.values()).iterator();
        while (true) {
            z10 = true;
            if (!it2.hasNext()) {
                break;
            }
            B b12 = (B) it2.next();
            if (map2.get(b12.mWho) == null) {
                if (F(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + b12 + " that was not found in the set of active Fragments " + a0Var.f12660a);
                }
                this.f12616L.q(b12);
                b12.mFragmentManager = this;
                g0 g0Var2 = new g0(c0883f, h0Var, b12);
                g0Var2.f12720e = 1;
                g0Var2.j();
                b12.mRemoving = true;
                g0Var2.j();
            }
        }
        ArrayList<String> arrayList2 = a0Var.f12661b;
        ((ArrayList) h0Var.f12725a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                B b13 = h0Var.b(str3);
                if (b13 == null) {
                    throw new IllegalStateException(S0.b.l("No instantiated fragment for (", str3, ")"));
                }
                if (F(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b13);
                }
                h0Var.a(b13);
            }
        }
        if (a0Var.f12662c != null) {
            this.f12621d = new ArrayList(a0Var.f12662c.length);
            int i10 = 0;
            while (true) {
                C0879b[] c0879bArr = a0Var.f12662c;
                if (i10 >= c0879bArr.length) {
                    break;
                }
                C0879b c0879b = c0879bArr[i10];
                ArrayList arrayList3 = c0879b.f12669b;
                C0878a c0878a = new C0878a(this);
                int[] iArr = c0879b.f12668a;
                int i11 = 0;
                int i12 = 0;
                while (i11 < iArr.length) {
                    i0 i0Var = new i0();
                    int i13 = i11 + 1;
                    int i14 = i4;
                    i0Var.f12732a = iArr[i11];
                    if (F(i14)) {
                        Log.v("FragmentManager", "Instantiate " + c0878a + " op #" + i12 + " base fragment #" + iArr[i13]);
                    }
                    i0Var.f12739h = EnumC0917o.values()[c0879b.f12670c[i12]];
                    i0Var.f12740i = EnumC0917o.values()[c0879b.f12671d[i12]];
                    int i15 = i11 + 2;
                    i0Var.f12734c = iArr[i13] != 0 ? z10 : false;
                    int i16 = iArr[i15];
                    i0Var.f12735d = i16;
                    int i17 = iArr[i11 + 3];
                    i0Var.f12736e = i17;
                    int i18 = i11 + 5;
                    int i19 = iArr[i11 + 4];
                    i0Var.f12737f = i19;
                    i11 += 6;
                    int[] iArr2 = iArr;
                    int i20 = iArr2[i18];
                    i0Var.f12738g = i20;
                    c0878a.f12644b = i16;
                    c0878a.f12645c = i17;
                    c0878a.f12646d = i19;
                    c0878a.f12647e = i20;
                    c0878a.b(i0Var);
                    i12++;
                    i4 = i14;
                    iArr = iArr2;
                    z10 = true;
                }
                int i21 = i4;
                c0878a.f12648f = c0879b.f12672e;
                c0878a.f12650h = c0879b.f12673f;
                c0878a.f12649g = true;
                c0878a.f12651i = c0879b.f12675h;
                c0878a.f12652j = c0879b.f12676i;
                c0878a.k = c0879b.f12677j;
                c0878a.f12653l = c0879b.k;
                c0878a.f12654m = c0879b.f12678l;
                c0878a.f12655n = c0879b.f12679m;
                c0878a.f12656o = c0879b.f12680n;
                c0878a.f12659r = c0879b.f12674g;
                for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                    String str4 = (String) arrayList3.get(i22);
                    if (str4 != null) {
                        ((i0) c0878a.f12643a.get(i22)).f12733b = h0Var.b(str4);
                    }
                }
                c0878a.c(1);
                if (F(i21)) {
                    StringBuilder sbI = AbstractC1983e.i(i10, "restoreAllState: back stack #", " (index ");
                    sbI.append(c0878a.f12659r);
                    sbI.append("): ");
                    sbI.append(c0878a);
                    Log.v("FragmentManager", sbI.toString());
                    PrintWriter printWriter = new PrintWriter(new r0());
                    c0878a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f12621d.add(c0878a);
                i10++;
                i4 = i21;
                z10 = true;
            }
            i9 = 0;
        } else {
            i9 = 0;
            this.f12621d = null;
        }
        this.f12626i.set(a0Var.f12663d);
        String str5 = a0Var.f12664e;
        if (str5 != null) {
            B b14 = h0Var.b(str5);
            this.f12639w = b14;
            q(b14);
        }
        ArrayList arrayList4 = a0Var.f12665f;
        if (arrayList4 != null) {
            for (int i23 = i9; i23 < arrayList4.size(); i23++) {
                this.f12627j.put((String) arrayList4.get(i23), (C0880c) a0Var.f12666g.get(i23));
            }
        }
        this.f12607C = new ArrayDeque(a0Var.f12667h);
    }

    public final Bundle Q() {
        int i4;
        ArrayList arrayList;
        C0879b[] c0879bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0889l c0889l = (C0889l) it.next();
            if (c0889l.f12754e) {
                if (F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0889l.f12754e = false;
                c0889l.d();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0889l) it2.next()).g();
        }
        x(true);
        this.f12609E = true;
        this.f12616L.f12690g = true;
        h0 h0Var = this.f12620c;
        h0Var.getClass();
        HashMap map = (HashMap) h0Var.f12726b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (g0 g0Var : map.values()) {
            if (g0Var != null) {
                B b10 = g0Var.f12718c;
                g0Var.m();
                arrayList2.add(b10.mWho);
                if (F(2)) {
                    Log.v("FragmentManager", "Saved state of " + b10 + ": " + b10.mSavedFragmentState);
                }
            }
        }
        h0 h0Var2 = this.f12620c;
        h0Var2.getClass();
        ArrayList<e0> arrayList3 = new ArrayList(((HashMap) h0Var2.f12727c).values());
        if (!arrayList3.isEmpty()) {
            h0 h0Var3 = this.f12620c;
            synchronized (((ArrayList) h0Var3.f12725a)) {
                try {
                    if (((ArrayList) h0Var3.f12725a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) h0Var3.f12725a).size());
                        for (B b11 : (ArrayList) h0Var3.f12725a) {
                            arrayList.add(b11.mWho);
                            if (F(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + b11.mWho + "): " + b11);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList4 = this.f12621d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c0879bArr = null;
            } else {
                c0879bArr = new C0879b[size];
                for (i4 = 0; i4 < size; i4++) {
                    c0879bArr[i4] = new C0879b((C0878a) this.f12621d.get(i4));
                    if (F(2)) {
                        StringBuilder sbI = AbstractC1983e.i(i4, "saveAllState: adding back stack #", ": ");
                        sbI.append(this.f12621d.get(i4));
                        Log.v("FragmentManager", sbI.toString());
                    }
                }
            }
            a0 a0Var = new a0();
            a0Var.f12664e = null;
            ArrayList arrayList5 = new ArrayList();
            a0Var.f12665f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            a0Var.f12666g = arrayList6;
            a0Var.f12660a = arrayList2;
            a0Var.f12661b = arrayList;
            a0Var.f12662c = c0879bArr;
            a0Var.f12663d = this.f12626i.get();
            B b12 = this.f12639w;
            if (b12 != null) {
                a0Var.f12664e = b12.mWho;
            }
            arrayList5.addAll(this.f12627j.keySet());
            arrayList6.addAll(this.f12627j.values());
            a0Var.f12667h = new ArrayList(this.f12607C);
            bundle.putParcelable("state", a0Var);
            for (String str : this.k.keySet()) {
                bundle.putBundle(K0.A("result_", str), (Bundle) this.k.get(str));
            }
            for (e0 e0Var : arrayList3) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", e0Var);
                bundle.putBundle("fragment_" + e0Var.f12700b, bundle2);
            }
        } else if (F(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void R() {
        synchronized (this.f12618a) {
            try {
                if (this.f12618a.size() == 1) {
                    this.f12636t.f12584c.removeCallbacks(this.f12617M);
                    this.f12636t.f12584c.post(this.f12617M);
                    Y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void S(B b10, boolean z10) {
        ViewGroup viewGroupB = B(b10);
        if (viewGroupB == null || !(viewGroupB instanceof I)) {
            return;
        }
        ((I) viewGroupB).setDrawDisappearingViewsLast(!z10);
    }

    public final void T(B b10, EnumC0917o enumC0917o) {
        if (b10.equals(this.f12620c.b(b10.mWho)) && (b10.mHost == null || b10.mFragmentManager == this)) {
            b10.mMaxState = enumC0917o;
            return;
        }
        throw new IllegalArgumentException("Fragment " + b10 + " is not an active fragment of FragmentManager " + this);
    }

    public final void U(B b10) {
        if (b10 != null) {
            if (!b10.equals(this.f12620c.b(b10.mWho)) || (b10.mHost != null && b10.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + b10 + " is not an active fragment of FragmentManager " + this);
            }
        }
        B b11 = this.f12639w;
        this.f12639w = b10;
        q(b11);
        q(this.f12639w);
    }

    public final void V(B b10) {
        ViewGroup viewGroupB = B(b10);
        if (viewGroupB != null) {
            if (b10.getPopExitAnim() + b10.getPopEnterAnim() + b10.getExitAnim() + b10.getEnterAnim() > 0) {
                if (viewGroupB.getTag(2131296573) == null) {
                    viewGroupB.setTag(2131296573, b10);
                }
                ((B) viewGroupB.getTag(2131296573)).setPopDirection(b10.getPopDirection());
            }
        }
    }

    public final void X(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new r0());
        J j2 = this.f12636t;
        if (j2 == null) {
            try {
                u("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw illegalStateException;
            }
        }
        try {
            ((E) j2).f12567e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw illegalStateException;
        }
    }

    public final void Y() {
        synchronized (this.f12618a) {
            try {
                if (!this.f12618a.isEmpty()) {
                    O o5 = this.f12625h;
                    o5.f18620a = true;
                    kotlin.jvm.internal.o oVar = o5.f18622c;
                    if (oVar != null) {
                        oVar.invoke();
                    }
                    return;
                }
                O o10 = this.f12625h;
                ArrayList arrayList = this.f12621d;
                o10.f18620a = (arrayList != null ? arrayList.size() : 0) > 0 && I(this.f12638v);
                kotlin.jvm.internal.o oVar2 = o10.f18622c;
                if (oVar2 != null) {
                    oVar2.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final g0 a(B b10) {
        String str = b10.mPreviousWho;
        if (str != null) {
            AbstractC1206d.d(b10, str);
        }
        if (F(2)) {
            Log.v("FragmentManager", "add: " + b10);
        }
        g0 g0VarF = f(b10);
        b10.mFragmentManager = this;
        h0 h0Var = this.f12620c;
        h0Var.g(g0VarF);
        if (!b10.mDetached) {
            h0Var.a(b10);
            b10.mRemoving = false;
            if (b10.mView == null) {
                b10.mHiddenChanged = false;
            }
            if (G(b10)) {
                this.f12608D = true;
            }
        }
        return g0VarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(J j2, H h9, B b10) {
        if (this.f12636t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f12636t = j2;
        this.f12637u = h9;
        this.f12638v = b10;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12629m;
        if (b10 != null) {
            copyOnWriteArrayList.add(new S(b10));
        } else if (j2 instanceof d0) {
            copyOnWriteArrayList.add((d0) j2);
        }
        if (this.f12638v != null) {
            Y();
        }
        if (j2 instanceof InterfaceC1102y) {
            InterfaceC1102y interfaceC1102y = (InterfaceC1102y) j2;
            C1101x c1101xB = interfaceC1102y.b();
            this.f12624g = c1101xB;
            InterfaceC0924w interfaceC0924w = interfaceC1102y;
            if (b10 != null) {
                interfaceC0924w = b10;
            }
            c1101xB.a(interfaceC0924w, this.f12625h);
        }
        if (b10 != null) {
            c0 c0Var = b10.mFragmentManager.f12616L;
            HashMap map = c0Var.f12686c;
            c0 c0Var2 = (c0) map.get(b10.mWho);
            if (c0Var2 == null) {
                c0Var2 = new c0(c0Var.f12688e);
                map.put(b10.mWho, c0Var2);
            }
            this.f12616L = c0Var2;
        } else if (j2 instanceof androidx.lifecycle.l0) {
            androidx.lifecycle.k0 viewModelStore = ((androidx.lifecycle.l0) j2).getViewModelStore();
            Intrinsics.checkNotNullParameter(viewModelStore, "store");
            b0 b0Var = c0.f12684h;
            Intrinsics.checkNotNullParameter(b0Var, "factory");
            C1472a c1472a = C1472a.f20983b;
            Intrinsics.checkNotNullParameter(viewModelStore, "store");
            Intrinsics.checkNotNullParameter(b0Var, "factory");
            Intrinsics.checkNotNullParameter(c1472a, "defaultCreationExtras");
            M0 m02 = new M0(viewModelStore, b0Var, c1472a);
            Intrinsics.checkNotNullParameter(c0.class, "modelClass");
            nl.d dVarE = C2.e(c0.class);
            Intrinsics.checkNotNullParameter(dVarE, "modelClass");
            Intrinsics.checkNotNullParameter(dVarE, "modelClass");
            String strJ = dVarE.j();
            if (strJ == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f12616L = (c0) m02.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strJ), dVarE);
        } else {
            this.f12616L = new c0(false);
        }
        c0 c0Var3 = this.f12616L;
        c0Var3.f12690g = this.f12609E || this.f12610F;
        this.f12620c.f12728d = c0Var3;
        Object obj = this.f12636t;
        if ((obj instanceof O4.g) && b10 == null) {
            O4.e savedStateRegistry = ((O4.g) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new C0540z0(2, this));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                P(bundleA);
            }
        }
        Object obj2 = this.f12636t;
        if (obj2 instanceof g.i) {
            g.h hVarL = ((g.i) obj2).l();
            String strA = K0.A("FragmentManager:", b10 != null ? A8.b.j(new StringBuilder(), b10.mWho, ":") : "");
            this.f12642z = hVarL.d(K0.r(strA, "StartActivityForResult"), new T(3), new N(this, 1));
            this.f12605A = hVarL.d(K0.r(strA, "StartIntentSenderForResult"), new T(0), new N(this, 2));
            this.f12606B = hVarL.d(K0.r(strA, "RequestPermissions"), new T(2), new N(this, 0));
        }
        Object obj3 = this.f12636t;
        if (obj3 instanceof InterfaceC2145e) {
            ((InterfaceC2145e) obj3).i(this.f12630n);
        }
        Object obj4 = this.f12636t;
        if (obj4 instanceof InterfaceC2146f) {
            ((InterfaceC2146f) obj4).g(this.f12631o);
        }
        Object obj5 = this.f12636t;
        if (obj5 instanceof t2.u) {
            ((t2.u) obj5).u(this.f12632p);
        }
        Object obj6 = this.f12636t;
        if (obj6 instanceof t2.v) {
            ((t2.v) obj6).a(this.f12633q);
        }
        Object obj7 = this.f12636t;
        if ((obj7 instanceof InterfaceC0228k) && b10 == null) {
            ((InterfaceC0228k) obj7).o(this.f12634r);
        }
    }

    public final void c(B b10) {
        if (F(2)) {
            Log.v("FragmentManager", "attach: " + b10);
        }
        if (b10.mDetached) {
            b10.mDetached = false;
            if (b10.mAdded) {
                return;
            }
            this.f12620c.a(b10);
            if (F(2)) {
                Log.v("FragmentManager", "add from attach: " + b10);
            }
            if (G(b10)) {
                this.f12608D = true;
            }
        }
    }

    public final void d() {
        this.f12619b = false;
        this.f12614J.clear();
        this.f12613I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f12620c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((g0) it.next()).f12718c.mContainer;
            if (viewGroup != null) {
                hashSet.add(C0889l.h(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final g0 f(B b10) {
        String str = b10.mWho;
        h0 h0Var = this.f12620c;
        g0 g0Var = (g0) ((HashMap) h0Var.f12726b).get(str);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(this.f12628l, h0Var, b10);
        g0Var2.k(this.f12636t.f12583b.getClassLoader());
        g0Var2.f12720e = this.f12635s;
        return g0Var2;
    }

    public final void g(B b10) {
        if (F(2)) {
            Log.v("FragmentManager", "detach: " + b10);
        }
        if (b10.mDetached) {
            return;
        }
        b10.mDetached = true;
        if (b10.mAdded) {
            if (F(2)) {
                Log.v("FragmentManager", "remove from detach: " + b10);
            }
            h0 h0Var = this.f12620c;
            synchronized (((ArrayList) h0Var.f12725a)) {
                ((ArrayList) h0Var.f12725a).remove(b10);
            }
            b10.mAdded = false;
            if (G(b10)) {
                this.f12608D = true;
            }
            V(b10);
        }
    }

    public final void h(boolean z10, Configuration configuration) {
        if (z10 && (this.f12636t instanceof InterfaceC2145e)) {
            X(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (B b10 : this.f12620c.f()) {
            if (b10 != null) {
                b10.performConfigurationChanged(configuration);
                if (z10) {
                    b10.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.f12635s < 1) {
            return false;
        }
        for (B b10 : this.f12620c.f()) {
            if (b10 != null && b10.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.f12635s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (B b10 : this.f12620c.f()) {
            if (b10 != null && b10.isMenuVisible() && b10.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(b10);
                z10 = true;
            }
        }
        if (this.f12622e != null) {
            for (int i4 = 0; i4 < this.f12622e.size(); i4++) {
                B b11 = (B) this.f12622e.get(i4);
                if (arrayList == null || !arrayList.contains(b11)) {
                    b11.onDestroyOptionsMenu();
                }
            }
        }
        this.f12622e = arrayList;
        return z10;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.f12611G = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0889l) it.next()).g();
        }
        J j2 = this.f12636t;
        boolean z10 = j2 instanceof androidx.lifecycle.l0;
        h0 h0Var = this.f12620c;
        if (z10) {
            zIsChangingConfigurations = ((c0) h0Var.f12728d).f12689f;
        } else {
            F f10 = j2.f12583b;
            if (f10 != null) {
                zIsChangingConfigurations = true ^ f10.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f12627j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0880c) it2.next()).f12682a) {
                    c0 c0Var = (c0) h0Var.f12728d;
                    c0Var.getClass();
                    if (F(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    c0Var.o(str);
                }
            }
        }
        t(-1);
        Object obj = this.f12636t;
        if (obj instanceof InterfaceC2146f) {
            ((InterfaceC2146f) obj).p(this.f12631o);
        }
        Object obj2 = this.f12636t;
        if (obj2 instanceof InterfaceC2145e) {
            ((InterfaceC2145e) obj2).h(this.f12630n);
        }
        Object obj3 = this.f12636t;
        if (obj3 instanceof t2.u) {
            ((t2.u) obj3).e(this.f12632p);
        }
        Object obj4 = this.f12636t;
        if (obj4 instanceof t2.v) {
            ((t2.v) obj4).f(this.f12633q);
        }
        Object obj5 = this.f12636t;
        if ((obj5 instanceof InterfaceC0228k) && this.f12638v == null) {
            ((InterfaceC0228k) obj5).r(this.f12634r);
        }
        this.f12636t = null;
        this.f12637u = null;
        this.f12638v = null;
        if (this.f12624g != null) {
            this.f12625h.e();
            this.f12624g = null;
        }
        g.g gVar = this.f12642z;
        if (gVar != null) {
            gVar.b();
            this.f12605A.b();
            this.f12606B.b();
        }
    }

    public final void l(boolean z10) {
        if (z10 && (this.f12636t instanceof InterfaceC2146f)) {
            X(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (B b10 : this.f12620c.f()) {
            if (b10 != null) {
                b10.performLowMemory();
                if (z10) {
                    b10.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z10, boolean z11) {
        if (z11 && (this.f12636t instanceof t2.u)) {
            X(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (B b10 : this.f12620c.f()) {
            if (b10 != null) {
                b10.performMultiWindowModeChanged(z10);
                if (z11) {
                    b10.mChildFragmentManager.m(z10, true);
                }
            }
        }
    }

    public final void n() {
        for (B b10 : this.f12620c.e()) {
            if (b10 != null) {
                b10.onHiddenChanged(b10.isHidden());
                b10.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.f12635s < 1) {
            return false;
        }
        for (B b10 : this.f12620c.f()) {
            if (b10 != null && b10.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.f12635s < 1) {
            return;
        }
        for (B b10 : this.f12620c.f()) {
            if (b10 != null) {
                b10.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(B b10) {
        if (b10 != null) {
            if (b10.equals(this.f12620c.b(b10.mWho))) {
                b10.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        if (z11 && (this.f12636t instanceof t2.v)) {
            X(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (B b10 : this.f12620c.f()) {
            if (b10 != null) {
                b10.performPictureInPictureModeChanged(z10);
                if (z11) {
                    b10.mChildFragmentManager.r(z10, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z10 = false;
        if (this.f12635s < 1) {
            return false;
        }
        for (B b10 : this.f12620c.f()) {
            if (b10 != null && b10.isMenuVisible() && b10.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void t(int i4) {
        try {
            this.f12619b = true;
            for (g0 g0Var : ((HashMap) this.f12620c.f12726b).values()) {
                if (g0Var != null) {
                    g0Var.f12720e = i4;
                }
            }
            J(i4, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0889l) it.next()).g();
            }
            this.f12619b = false;
            x(true);
        } catch (Throwable th) {
            this.f12619b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(com.alipay.sdk.m.p.a.f17908a);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        B b10 = this.f12638v;
        if (b10 != null) {
            sb.append(b10.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f12638v)));
            sb.append(com.alipay.sdk.m.y.l.f18224d);
        } else {
            J j2 = this.f12636t;
            if (j2 != null) {
                sb.append(j2.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f12636t)));
                sb.append(com.alipay.sdk.m.y.l.f18224d);
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strR = K0.r(str, "    ");
        h0 h0Var = this.f12620c;
        ArrayList arrayList = (ArrayList) h0Var.f12725a;
        String strR2 = K0.r(str, "    ");
        HashMap map = (HashMap) h0Var.f12726b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (g0 g0Var : map.values()) {
                printWriter.print(str);
                if (g0Var != null) {
                    B b10 = g0Var.f12718c;
                    printWriter.println(b10);
                    b10.dump(strR2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size3; i4++) {
                B b11 = (B) arrayList.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(b11.toString());
            }
        }
        ArrayList arrayList2 = this.f12622e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i9 = 0; i9 < size2; i9++) {
                B b12 = (B) this.f12622e.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(b12.toString());
            }
        }
        ArrayList arrayList3 = this.f12621d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i10 = 0; i10 < size; i10++) {
                C0878a c0878a = (C0878a) this.f12621d.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(c0878a.toString());
                c0878a.f(strR, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f12626i.get());
        synchronized (this.f12618a) {
            try {
                int size4 = this.f12618a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i11 = 0; i11 < size4; i11++) {
                        Object obj = (W) this.f12618a.get(i11);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i11);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f12636t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f12637u);
        if (this.f12638v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f12638v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f12635s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f12609E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f12610F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f12611G);
        if (this.f12608D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f12608D);
        }
    }

    public final void v(W w10, boolean z10) {
        if (!z10) {
            if (this.f12636t == null) {
                if (!this.f12611G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f12609E || this.f12610F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f12618a) {
            try {
                if (this.f12636t == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f12618a.add(w10);
                    R();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z10) {
        if (this.f12619b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f12636t == null) {
            if (!this.f12611G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f12636t.f12584c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && (this.f12609E || this.f12610F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f12613I == null) {
            this.f12613I = new ArrayList();
            this.f12614J = new ArrayList();
        }
    }

    public final boolean x(boolean z10) {
        boolean zA;
        w(z10);
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f12613I;
            ArrayList arrayList2 = this.f12614J;
            synchronized (this.f12618a) {
                if (this.f12618a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f12618a.size();
                        zA = false;
                        for (int i4 = 0; i4 < size; i4++) {
                            zA |= ((W) this.f12618a.get(i4)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.f12619b = true;
            try {
                O(this.f12613I, this.f12614J);
                d();
                z11 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        Y();
        if (this.f12612H) {
            this.f12612H = false;
            for (g0 g0Var : this.f12620c.d()) {
                B b10 = g0Var.f12718c;
                if (b10.mDeferStart) {
                    if (this.f12619b) {
                        this.f12612H = true;
                    } else {
                        b10.mDeferStart = false;
                        g0Var.j();
                    }
                }
            }
        }
        ((HashMap) this.f12620c.f12726b).values().removeAll(Collections.singleton(null));
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0227 A[PHI: r14
      0x0227: PHI (r14v14 int) = (r14v13 int), (r14v15 int) binds: [B:100:0x0217, B:105:0x0223] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Y.y(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final B z(int i4) {
        h0 h0Var = this.f12620c;
        ArrayList arrayList = (ArrayList) h0Var.f12725a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            B b10 = (B) arrayList.get(size);
            if (b10 != null && b10.mFragmentId == i4) {
                return b10;
            }
        }
        for (g0 g0Var : ((HashMap) h0Var.f12726b).values()) {
            if (g0Var != null) {
                B b11 = g0Var.f12718c;
                if (b11.mFragmentId == i4) {
                    return b11;
                }
            }
        }
        return null;
    }
}
