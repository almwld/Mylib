package ye;

import Dc.C0568n;
import Dc.C0639v;
import Mm.C;
import Mm.E;
import Pm.r0;
import bh.t;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import je.AbstractC3714u;
import je.C3695k0;
import kotlin.coroutines.CoroutineContext;
import ue.C4795f;
import ue.C4801l;
import ze.b0;

/* JADX INFO: renamed from: ye.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C5729d implements b0 {
    public final /* synthetic */ int a;
    public final Object b;

    public C5729d(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new LinkedHashSet();
                break;
            default:
                this.b = new Jc.b(2);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0761  */
    @Override // ze.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ue.C4801l r54, ze.a0 r55) {
        /*
            Method dump skipped, instruction units count: 3492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.C5729d.a(ue.l, ze.a0):void");
    }

    public void b(C4801l c4801l) {
        C4795f c4795f = c4801l.g;
        r0 r0Var = c4801l.j;
        String str = ((C0639v) c4795f.c).a;
        String str2 = c4801l.a;
        if (str.length() == 0 && str2.length() == 0) {
            return;
        }
        Iterable<C3695k0> iterable = (Iterable) r0Var.getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return;
        }
        for (C3695k0 c3695k0 : iterable) {
            C3695k0 c3695k02 = C3695k0.h;
            if (c3695k0.v(true)) {
                E.z(c4801l.e, (CoroutineContext) null, (C) null, new C5728c(str2, this, str, c4801l, null), 3);
                Iterable iterable2 = (Iterable) r0Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable2) {
                    if (((C3695k0) obj).n()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List list = ((C3695k0) it.next()).a.m;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (AbstractC3714u.b((C0568n) it2.next())) {
                                t.k(str, BuildConfig.FLAVOR, BuildConfig.FLAVOR, true);
                                return;
                            }
                        }
                    }
                }
                return;
            }
        }
    }
}
