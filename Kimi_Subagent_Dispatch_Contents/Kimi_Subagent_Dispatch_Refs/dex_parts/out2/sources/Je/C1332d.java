package Je;

import Dc.Z6;
import Ee.M;
import java.nio.charset.Charset;
import je.C1;
import kotlin.Unit;

/* JADX INFO: renamed from: Je.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C1332d implements Pm.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Pm.h b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ C1332d(Pm.h hVar, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = hVar;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public final Object collect(Pm.i iVar, Vk.a aVar) {
        switch (this.a) {
            case 0:
                Object objCollect = this.b.collect(new M(iVar, (Z6) this.c, (C1) this.d, (Zd.B) this.e, (Zd.E) this.f, 1), aVar);
                if (objCollect != Wk.a.a) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.b.collect(new M(iVar, (qk.i) this.c, (Charset) this.d, (Hk.a) this.e, this.f, 2), aVar);
                if (objCollect2 != Wk.a.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
