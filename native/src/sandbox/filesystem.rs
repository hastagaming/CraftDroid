use std::fs;

pub fn create_container(name: &str) {
    let base = format!("containers/{}", name);

    fs::create_dir_all(format!("{}/logs", base)).unwrap();
    fs::create_dir_all(format!("{}/plugins", base)).unwrap();
    fs::create_dir_all(format!("{}/worlds", base)).unwrap();
}