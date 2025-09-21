Button botaoOi = findViewById(R.id.botaoOi);
botaoOi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        File pasta = new File(Environment.getExternalStorageDirectory(), "android");
        if (pasta.exists()) {
            deleteRecursive(pasta);
            Toast.makeText(MainActivity.this, "Pasta apagada!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Pasta não existe.", Toast.LENGTH_SHORT).show();
        }
    }
});

private void deleteRecursive(File fileOrDirectory) {
    if (fileOrDirectory.isDirectory())
        for (File child : fileOrDirectory.listFiles())
            deleteRecursive(child);

    fileOrDirectory.delete();
}
