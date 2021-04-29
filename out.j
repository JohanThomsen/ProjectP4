.class public NoJad/out
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
ldc 0.0
fstore 0
ldc 0.0
fstore 1
LoopStart0:
fload 1
ldc 10.0
fcmpl
ifle truelabel0
iconst_0
goto endlabel0
truelabel0:
iconst_1
endlabel0:
ifeq BranchEnd0
fload 1
ldc 4.0
fcmpl
ifeq truelabel1
iconst_0
goto endlabel1
truelabel1:
iconst_1
endlabel1:
ifeq BranchEnd1
fload 0
fload 1
fadd
fstore 0
BranchEnd1:
fconst_1
fload 1
fadd
fstore 1

fload 1
getstatic java/lang/System/out Ljava/io/PrintStream;
astore 10
invokestatic java/lang/String/valueOf(F)Ljava/lang/String;
astore 11
aload 10
aload 11
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto LoopStart0
BranchEnd0:

.limit locals 50
.limit stack 10
return
.end method
