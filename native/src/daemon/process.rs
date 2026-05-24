use std::process::Command;

pub fn start_process(command: &str) {
    let _ = Command::new("sh")
        .arg("-c")
        .arg(command)
        .spawn();
}