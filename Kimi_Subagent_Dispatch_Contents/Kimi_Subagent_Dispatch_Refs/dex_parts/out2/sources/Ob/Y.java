package Ob;

import java.util.Iterator;
import java.util.NoSuchElementException;
import vb.P2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends E0 {
    public int a;
    public Object b;
    public final /* synthetic */ int c;
    public final Iterator d;
    public final /* synthetic */ Object e;

    public Y() {
        this.a = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        P2.s(this.a != 4);
        int iN = v.z.n(this.a);
        if (iN == 0) {
            return true;
        }
        if (iN != 2) {
            this.a = 4;
            switch (this.c) {
                case 0:
                    do {
                        Iterator it = this.d;
                        if (!it.hasNext()) {
                            this.a = 3;
                            next = null;
                        } else {
                            next = it.next();
                        }
                        break;
                    } while (!((Nb.h) this.e).apply(next));
                    break;
                case 1:
                    do {
                        Iterator it2 = this.d;
                        if (!it2.hasNext()) {
                            this.a = 3;
                            next = null;
                        } else {
                            next = it2.next();
                        }
                        break;
                    } while (!((y0) this.e).d.contains(next));
                    break;
                default:
                    do {
                        Iterator it3 = this.d;
                        if (!it3.hasNext()) {
                            this.a = 3;
                            next = null;
                        } else {
                            next = it3.next();
                        }
                        break;
                    } while (((C0) ((y0) this.e).d).d.equals(next));
                    break;
            }
            this.b = next;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(Iterator it, Nb.h hVar) {
        this();
        this.c = 0;
        this.d = it;
        this.e = hVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(y0 y0Var) {
        this();
        this.c = 1;
        this.e = y0Var;
        this.d = y0Var.c.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(y0 y0Var, byte b) {
        this();
        this.c = 2;
        this.e = y0Var;
        this.d = y0Var.c.iterator();
    }
}
